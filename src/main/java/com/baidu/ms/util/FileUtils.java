package com.baidu.ms.util;

import org.springframework.stereotype.Component;

import java.io.*;
import java.net.FileNameMap;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.List;

@Component
public class FileUtils extends org.apache.commons.io.FileUtils {

    /**
     * 新建目录
     *
     * @param folderPath String 如 c:/fqf
     * @return boolean
     */
    public static boolean newFolder(String folderPath) {
        try {
            boolean flag = true;
            String filePath = folderPath;
            filePath = filePath.toString();
            File myFilePath = new File(filePath);
            if (!myFilePath.exists()) {
                flag = myFilePath.mkdirs();
            }
            return flag;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 将byte数组写到某个文件
     *
     * @param file
     * @param data
     * @throws IOException
     */
    public static void newFile(File file, byte[] data) throws IOException {
        final int MAX_BUFFER_SIZE = 4096;
        FileOutputStream output = null;
        FileChannel fc = null;
        try {
            output = new FileOutputStream(file);
            fc = output.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(MAX_BUFFER_SIZE);
            int offset = 0;
            while (offset < data.length) {
                buffer.clear();
                int len = data.length - offset;
                if (len > MAX_BUFFER_SIZE)
                    len = MAX_BUFFER_SIZE;
                buffer.put(data, offset, len);
                offset += len;
                buffer.flip();
                fc.write(buffer);
            }
        } finally {
            if (fc != null) {
                try {
                    fc.close();
                } catch (IOException e) {
                }
            }
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                }
            }
        }
    }

    /**
     * 复制单个文件
     *
     * @param oldPath String 原文件路径 如：c:/fqf.txt
     * @param newPath String 复制后路径 如：f:/fqf.txt
     * @return boolean
     */
    public static void copyFile(String oldPath, String newPath) {
        int byteread = 0;
        InputStream is = null;
        FileOutputStream os = null;
        try {
            File oldfile = new File(oldPath);
            if (oldfile.exists()) { // 文件存在时
                is = new FileInputStream(oldPath); // 读入原文件
                os = new FileOutputStream(newPath);
                byte[] buffer = new byte[1444];
                while ((byteread = is.read(buffer)) != -1) {
                    os.write(buffer, 0, byteread);
                }
            }
        } catch (Exception e) {
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
                if (os != null)
                    os.close();
            } catch (Exception e) {
            }
        }
    }

    /**
     * 复制整个文件夹内容
     *
     * @param oldPath String 原文件路径 如：c:/fqf
     * @param newPath String 复制后路径 如：f:/fqf/ff
     * @return boolean
     */
    public static void copyFolder(String oldPath, String newPath) {
        try {
            (new File(newPath)).mkdirs(); // 如果文件夹不存在 则建立新文件夹
            File a = new File(oldPath);
            String[] file = a.list();
            File temp = null;
            for (int i = 0; i < file.length; i++) {
                if (oldPath.endsWith(File.separator)) {
                    temp = new File(oldPath + file[i]);
                } else {
                    temp = new File(oldPath + File.separator + file[i]);
                }
                if (temp.isFile()) {
                    FileInputStream input = new FileInputStream(temp);
                    FileOutputStream output = new FileOutputStream(newPath + "/" + (temp.getName()).toString());
                    byte[] b = new byte[1024 * 5];
                    int len;
                    while ((len = input.read(b)) != -1) {
                        output.write(b, 0, len);
                    }
                    output.flush();
                    output.close();
                    input.close();
                }
                if (temp.isDirectory()) {// 如果是子文件夹
                    copyFolder(oldPath + "/" + file[i], newPath + "/" + file[i]);
                }
            }
        } catch (Exception e) {
        }

    }

    /**
     * 移动文件
     */
    public static boolean moveFile(String srcFile, String destPath, String destFileName) {
        if (srcFile == null || destPath == null || destFileName == null || srcFile.length() == 0
                || destPath.length() == 0 || destFileName.length() == 0)
            return false;
        File file = new File(srcFile);
        if (!file.exists())
            return false;
        File targePath = new File(destPath);
        if (!targePath.exists())
            targePath.mkdirs();
        boolean success = file.renameTo(new File(destPath, destFileName));
        return success;
    }

    /**
     * 删除文件
     */
    public static boolean delFile(String filePathAndName) {
        try {
            File file = new File(filePathAndName);
            if (file.exists()) {
                return file.delete();
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 删除文件夹和下面的所有文件、文件夹
     */
    public static boolean delFolder(String folderPath) {
        boolean flag = true;
        try {
            flag = delAllFile(folderPath); // 删除完里面所有内容
            File folder = new File(folderPath);
            if (folder.exists())
                flag = folder.delete(); // 删除空文件夹
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    /**
     * 删除文件夹里面的所有文件
     *
     * @param path String 文件夹路径 如 c:/fqf
     */
    public static boolean delAllFile(String path) {
        boolean flag = true;
        try {
            File file = new File(path);
            if (!file.exists()) {
                return false;
            }
            if (!file.isDirectory()) {
                return false;
            }

            String[] tempList = file.list();
            File temp = null;
            for (int i = 0; i < tempList.length; i++) {
                if (path.endsWith(File.separator)) {
                    temp = new File(path + tempList[i]);
                } else {
                    temp = new File(path + File.separator + tempList[i]);
                }
                if (temp.isFile()) {
                    flag = temp.delete();
                }
                if (temp.isDirectory() && flag) {
                    flag = delAllFile(path + "/" + tempList[i]);// 先删除文件夹里面的文件
                    if (flag) {
                        flag = delFolder(path + "/" + tempList[i]);// 再删除空文件夹
                    }
                }
            }
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    /**
     * 读取文件到流
     *
     * @param file
     * @param output
     * @throws IOException
     */
    public static void readFile(File file, OutputStream output) throws IOException {
        FileInputStream input = null;
        FileChannel fc = null;
        try {
            input = new FileInputStream(file);
            fc = input.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(4096);
            for (; ; ) {
                buffer.clear();
                int n = fc.read(buffer);
                if (n == (-1))
                    break;
                output.write(buffer.array(), 0, buffer.position());
            }
            output.flush();
        } finally {
            if (fc != null) {
                try {
                    fc.close();
                } catch (IOException e) {
                }
            }
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                }
            }
        }
    }

    /**
     * 获得文件后缀名
     *
     * @param fileName
     * @return
     */
    public static String getFileExtension(String fileName) {
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        } else {
            return "";
        }
    }

    /**
     * 获得文件名不含后缀
     *
     * @param filename
     * @return
     */
    public static String getFileNameNoEx(String filename) {
        if ((filename != null) && (filename.length() > 0)) {
            int dot = filename.lastIndexOf('.');
            if ((dot > -1) && (dot < (filename.length()))) {
                return filename.substring(0, dot);
            }
        }
        return filename;
    }

    /**
     * 获得文件头类型
     *
     * @param fileUrl
     * @return
     * @throws IOException
     */
    public static String getMimeType(String fileUrl) throws IOException {
        FileNameMap fileNameMap = URLConnection.getFileNameMap();
        String type = fileNameMap.getContentTypeFor(fileUrl);
        return type;
    }

    /**
     * 获取文件类型
     *
     * @param mime
     * @return
     */
    public static String getFileType(String mime) {
        if (mime.contains("video")) {
            return "video";
        } else if (mime.contains("image")) {
            return "image";
        } else if (mime.contains("audio")) {
            return "voice";
        }
        throw new RuntimeException("未知类型：" + mime);
    }

    /**
     * 获得文本文件中的文本
     */
    public static String getContentFromFile(String filePath) {
        try {
            List<String> lists = null;
            if (!(new File(filePath).exists())) {
                return "";
            }
            lists = FileUtils.readLines(new File(filePath), Charset.defaultCharset());
            StringBuilder sb = new StringBuilder();
            for (String str : lists) {
                sb.append(str);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";

    }
}
