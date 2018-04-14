package com.baidu.ms.controller;

import com.baidu.ms.pojo.ResourceFile;
import com.baidu.ms.service.ResourceFileService;
import com.baidu.ms.service.ShopService;
import com.baidu.ms.service.SystemConfigService;
import com.baidu.ms.service.UserService;
import com.baidu.ms.util.DateUtils;
import com.baidu.ms.util.FileUtils;
import com.baidu.ms.util.ImageUtils;
import com.baidu.ms.util.StringUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.annotation.PostConstruct;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("res")
public class ResourceFileController extends BaseController {
    //	ActivityService activityService;
//	ActivityParticipatorService apService;
//	ResourceFileService resourceFileService;
//	GoodsService goodsService;
    @Autowired(required = false)
    private ShopService shopService;
    @Autowired(required = false)
    private UserService userService;
    @Autowired(required = false)
    private SystemConfigService systemConfigService;
    @Autowired(required = false)
    private ResourceFileService resourceFileService;

    private String fileRootPath;

    @PostConstruct
    public void init() throws Exception {
        //TODO 数据库获取fileRootPath
        //fileRootPath = systemConfigService.getSystemConfigValue("file_root_path");
    }

    /**
     * 文件上传
     */
    @RequestMapping("uploadFile")
    @ResponseBody
    public Model uploadFile(Model model) throws Exception {
        boolean flag = true;
        List<ResourceFile> resourceFileList = null;
        ResourceFile resourceFile = new ResourceFile();

        if (fileRootPath.startsWith("/")) {
            fileRootPath = session.getServletContext().getRealPath("/") + fileRootPath;
        }

        String fileType = request.getParameter("fileType");
        String uploadPath = "/upload/" + fileType + "/";
        String dateDir = DateUtils.getCurDateStr();
        flag = FileUtils.newFolder(fileRootPath + uploadPath + dateDir);   //创建文件文件夹

        if (flag) {
            CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
            if (multipartResolver.isMultipart(request)) {
                MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
                Iterator iter = multiRequest.getFileNames();

                while (iter.hasNext()) {
                    MultipartFile file = multiRequest.getFile((String) iter.next());
                    if (file != null) {
                        String newFileName = System.currentTimeMillis() + RandomStringUtils.randomAlphanumeric(5) + "." + FileUtils.getFileExtension(file.getOriginalFilename());
                        String path = fileRootPath + uploadPath + dateDir + "/" + newFileName;
                        File localFile = new File(path);
                        //写文件到本地
                        file.transferTo(localFile);

                        resourceFile = new ResourceFile();
                        resourceFile.setFileName(file.getOriginalFilename());
                        resourceFile.setFileType(fileType);
                        resourceFile.setFileUrl(uploadPath + dateDir + "/" + newFileName);
                        resourceFile.setCreateTime(new Date());
                        resourceFile.setShopId(this.getCurrentShop().getId());

                        flag = resourceFileService.createResourceFile(resourceFile);
                        resourceFileList.add(resourceFile);
                    }
                }
            }

        }

        if (flag) {
            model.addAttribute("file", resourceFileList.size() > 1 ? resourceFileList : resourceFileList.get(0));
            model.addAttribute(RESULT, RESULT_SUCCESS);
            model.addAttribute(MSG, "上传成功");
        } else {
            model.addAttribute(RESULT, RESULT_FAIL);
            model.addAttribute(MSG, "上传失败!");
        }
        return model;
    }

    /**
     * 获取网络图片
     */
    @RequestMapping("/fetchNetworkPic")
    @ResponseBody
    public Model fetchNetworkPic(Model model) throws Exception {
        boolean flag = true;
        ResourceFile resourceFile = null;
        BufferedImage bufferedImg = null;
        if (fileRootPath.startsWith("/")) {
            fileRootPath = session.getServletContext().getRealPath("/") + fileRootPath;
        }

        String fileType = request.getParameter("fileType");
        String networkUrl = request.getParameter("network_url");
        String fileName = System.currentTimeMillis() + RandomStringUtils.randomAlphanumeric(5) + "." + FileUtils.getFileExtension(networkUrl.substring(networkUrl.lastIndexOf("/") + 1));
        String dateDir = DateUtils.getCurDateStr();
        String uploadPath = "/upload/" + fileType + "/";

        flag = FileUtils.newFolder(fileRootPath + uploadPath + dateDir);

        if (flag) {
            ImageUtils.fetchNetworkPic(networkUrl, fileRootPath + uploadPath + dateDir + "/" + fileName);

            resourceFile = new ResourceFile();
            resourceFile.setFileName(fileName);
            resourceFile.setFileType(fileType);
            resourceFile.setFileUrl(uploadPath + dateDir + "/" + fileName);
            resourceFile.setCreateTime(new Date());
            resourceFile.setShopId(this.getCurrentShop().getId());

            if (fileType.equals(ResourceFile.FILE_TYPE_PIC)) {
                bufferedImg = ImageIO.read(new File(fileRootPath + uploadPath + dateDir + "/" + fileName));
                int imgWidth = bufferedImg.getWidth();
                int imgHeight = bufferedImg.getHeight();
                resourceFile.setWidth(imgWidth);
                resourceFile.setHeight(imgHeight);
            }
            if (bufferedImg != null) {
                bufferedImg = null;
            }

            flag = resourceFileService.createResourceFile(resourceFile);
        }

        if (flag) {
            model.addAttribute("file", resourceFile);
            model.addAttribute(RESULT, RESULT_SUCCESS);
            model.addAttribute(MSG, "上传成功");
        } else {
            model.addAttribute(RESULT, RESULT_FAIL);
            model.addAttribute(MSG, "上传失败!");
        }

        return model;
    }

    /**
     * 资源文件查看
     */
    @RequestMapping("/file/{id}/{width}/height")
    public void file(HttpServletResponse response, @PathVariable Integer id, @PathVariable Integer width, @PathVariable Integer height) throws Exception {
        String err = session.getServletContext().getRealPath("/") + "img/404.jpg";
        String path = "";// 未压缩前的全路径名
        ResourceFile rf = resourceFileService.getResourceFile(id);
        String fileRootPath = systemConfigService.getSystemConfigValue("file_root_path");
        if (fileRootPath.startsWith("/")) {
            fileRootPath = FilenameUtils.concat(session.getServletContext().getRealPath("/"), fileRootPath.substring(1));
        }
        if (rf != null && StringUtils.isNotBlank(rf.getFileUrl())) {
            String s = rf.getFileUrl();
            if (s.startsWith("/")) {
                s = s.substring(1);
            }
            path = FilenameUtils.concat(fileRootPath, s);
        }
        File file = new File(path);


        if (!file.exists() || StringUtils.isBlank(rf.getFileUrl())) {
            // 不存在图片时
            file = new File(err);
        } else if (rf.getFileType().equals("picture") && (width > 0 || height > 0)) {// 都成立就开始压缩
            String fileName = FilenameUtils.getBaseName(path);// 得到文件名
            String extName = FilenameUtils.getExtension(path);// 扩展名
            if (width == 0 && rf != null && rf.getWidth() != null) {
                width = rf.getWidth();
            }
            fileName = fileName + "_" + width;
            if (height > 0) {
                // height = rf.getHeight();
                fileName = fileName + "_" + height;
            }
            String newPath = FilenameUtils.concat(FilenameUtils.getFullPath(path), fileName + "." + extName);// 得到压缩后的文件名
            File fileTemp = new File(newPath);
            if (!fileTemp.exists()) {
                IMOperation op = new IMOperation();
                ConvertCmd convert = new ConvertCmd(true);
                // convert.setSearchPath("D:/GraphicsMagick-1.3.21-Q8");
                op.addImage(path);
                if (height > 0) {
                    op.resize(width, height);
                } else {
                    op.resize(width);
                }
                op.addImage(newPath);
                convert.run(op);
            }
            file = fileTemp;
        }

//        BufferedImage img =
    }

    /**
     * 查看活动二维码
     */
    @RequestMapping("/viewActivityQr")
    public String viewActivityQr() throws Exception {
        return null;
    }
}
