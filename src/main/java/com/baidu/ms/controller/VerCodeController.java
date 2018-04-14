package com.baidu.ms.controller;

import com.octo.captcha.service.image.ImageCaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

/**
 * Created by lmy on 2017/2/19.
 */

@Controller
@RequestMapping("/verCode")
public class VerCodeController extends BaseController {
    @Autowired(required = false)
    private ImageCaptchaService imageCaptchaService;

    @RequestMapping("/img")
    public void img(HttpServletResponse response) throws Exception {
//        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        String captchaId = request.getSession().getId();
        BufferedImage challenge = imageCaptchaService.getImageChallengeForID(captchaId, request.getLocale());

        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0L);
        response.setContentType("image/jpeg");
        ServletOutputStream respOs = response.getOutputStream();
        ImageIO.write(challenge, "jpeg", respOs);
        respOs.flush();
        respOs.close();
    }

    @RequestMapping("validate")
    @ResponseBody
    public String validate() throws Exception {
        return "y";
    }

    @RequestMapping("success")
    public String bbbbbbb() {
        String mobile = request.getParameter("mobile");
        System.out.println(mobile);
        return "success";
    }
}
