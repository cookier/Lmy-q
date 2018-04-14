package com.baidu.ms.util;

import com.baidu.ms.common.BufferedImageLuminanceSource;
import com.baidu.ms.common.LogoConfig;
import com.google.zxing.*;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.springframework.stereotype.Component;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 二维码生成解析类
 *
 * @author Administrator
 */

@Component
public class QrcodeUtils {

    /**
     * 给二维码图片添加Logo
     *
     * @param qrPic
     * @param logoPic
     */

    public void addLogo_QRCode(File qrPic, File logoPic, LogoConfig logoConfig) {
        try {
            if (!qrPic.isFile() || !logoPic.isFile()) {
                System.out.print("file not find !");
                //System.exit(0);
                throw new RuntimeException("file not find");
            }

            /**
             * 读取二维码图片，并构建绘图对象
             */
            BufferedImage image = ImageIO.read(qrPic);
            Graphics2D g = image.createGraphics();

            /**
             * 读取Logo图片
             */
            BufferedImage logo = ImageIO.read(logoPic);

            int widthLogo = logo.getWidth(), heightLogo = logo.getHeight();

            // 计算图片放置位置
            int x = (image.getWidth() - widthLogo) / 2;
            int y = (image.getHeight() - logo.getHeight()) / 2;

            // 开始绘制图片
            g.drawImage(logo, x, y, widthLogo, heightLogo, null);
            g.drawRoundRect(x, y, widthLogo, heightLogo, 15, 15);
            g.setStroke(new BasicStroke(logoConfig.getBorder()));
            g.setColor(logoConfig.getBorderColor());
            g.drawRect(x, y, widthLogo, heightLogo);

            g.dispose();

            ImageIO.write(image, "jpeg", new File("D:/newPic.jpg"));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * 二维码的解析
     *
     * @param file
     */
    public void parseQR_CODEImage(File file) {
        try {
            MultiFormatReader formatReader = new MultiFormatReader();
            if (!file.exists()) {
                return;
            }
            BufferedImage image = ImageIO.read(file);
            LuminanceSource source = new BufferedImageLuminanceSource(image);
            Binarizer binarizer = new HybridBinarizer(source);
            BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);

            Map hints = new HashMap();
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            Result result = formatReader.decode(binaryBitmap, hints);

            System.out.println("result = " + result.toString());
            System.out.println("resultFormat = " + result.getBarcodeFormat());
            System.out.println("resultText = " + result.getText());
        } catch (Exception e) {
        }
    }

    /**
     * 将二维码生成为文件
     *
     * @param bm
     * @param imageFormat
     * @param file
     */
    public void decodeQR_CODE2ImageFile(BitMatrix bm, String imageFormat, File file) {
        try {
            if (null == file || file.getName().trim().isEmpty()) {
                throw new IllegalArgumentException("文件异常，或扩展名有问题！");
            }
            BufferedImage bi = fileToBufferedImage(bm);
            ImageIO.write(bi, "jpeg", file);
        } catch (Exception e) {
        }
    }

    /**
     * 将二维码生成为输出流
     */
    public void decodeQR_CODE2OutputStream(BitMatrix bm, String imageFormat, OutputStream os) {
        try {
            BufferedImage image = fileToBufferedImage(bm);
            ImageIO.write(image, imageFormat, os);
        } catch (Exception e) {
        }
    }

    /**
     * 构建初始化二维码
     *
     * @param bm
     * @return
     */
    public BufferedImage fileToBufferedImage(BitMatrix bm) {
        BufferedImage image = null;
        try {
            int w = bm.getWidth(), h = bm.getHeight();
            image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            for (int x = 0; x < w; x++) {
                for (int y = 0; y < h; y++) {
                    image.setRGB(x, y, bm.get(x, y) ? 0xFF000000 : 0xFFCCDDEE);
                }
            }
        } catch (Exception e) {
        }
        return image;
    }

    /**
     * 生成二维码bufferedImage图片
     *
     * @param content       编码内容
     * @param barcodeFormat 编码类型
     * @param width         图片宽度
     * @param height        图片高度
     * @param hints         设置参数
     * @return
     */
    public BufferedImage getQR_CODEBufferedImage(String content, BarcodeFormat barcodeFormat, int width, int height,
                                                 Map<EncodeHintType, ?> hints) {
        MultiFormatWriter multiFormatWriter = null;
        BitMatrix bm = null;
        BufferedImage image = null;
        try {
            multiFormatWriter = new MultiFormatWriter();

            // 参数顺序分别为：编码内容，编码类型，生成图片宽度，生成图片高度，设置参数
            bm = multiFormatWriter.encode(content, barcodeFormat, width, height, hints);

            int w = bm.getWidth();
            int h = bm.getHeight();
            image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);

            // 开始利用二维码数据创建Bitmap图片，分别设为黑（0xFFFFFFFF）白（0xFF000000）两色
            for (int x = 0; x < w; x++) {
                for (int y = 0; y < h; y++) {
                    image.setRGB(x, y, bm.get(x, y) ? 0xFF000000 : 0xFFCCDDEE);
                }
            }
        } catch (WriterException e) {
        }
        return image;
    }

    /**
     * 设置二维码的格式参数
     *
     * @return
     */
    public Map<EncodeHintType, Object> getDecodeHintType() {
        // 用于设置QR二维码参数
        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
        // 设置QR二维码的纠错级别（H为最高级别）具体级别信息
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        // 设置编码方式
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        hints.put(EncodeHintType.MAX_SIZE, 350);
        hints.put(EncodeHintType.MIN_SIZE, 100);

        return hints;
    }

    public static void main(String[] args) throws WriterException {
        //String content = "【优秀员工】恭喜您，中奖了！！！领取方式，请拨打电话：15998099997*咨询。";
        String content = "http://yunzhongbang.com/wap/6";

        try {
            File file = file = new File("D:/", new Date().getTime() + ".jpg");
            if (!file.exists()) {
                file.createNewFile();

            }

            QrcodeUtils zp = new QrcodeUtils();
            BufferedImage bim = zp.getQR_CODEBufferedImage(content, BarcodeFormat.QR_CODE, 3000, 3000,
                    zp.getDecodeHintType());
            ImageIO.write(bim, "jpeg", file);

            //zp.addLogo_QRCode(file, new File("D:/111.jpg"), new LogoConfig());

            Thread.sleep(5000);
            //zp.parseQR_CODEImage(new File("D:/newPic.jpg"));
        } catch (Exception e) {
        }
    }
}
