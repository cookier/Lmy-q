import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Test;

import java.io.*;
/**
 * Created by lmy on 2017/5/31.
 */
public class TestOffice {
    @Test
    public void testOne() {
        File inputFile = new File("E:\\test.doc");
        File outputFile = new File("E:\\document.pdf");
        OpenOfficeConnection connection = new SocketOpenOfficeConnection(8100);
        try {
            connection.connect();
            DocumentConverter converter = new OpenOfficeDocumentConverter(connection);
            converter.convert(inputFile, outputFile);
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTwo() throws IOException {
        String OpenOffice_HOME = "C:/Program Files (x86)/OpenOffice 4";// 这里是OpenOffice的安装目录,  
        // 在我的项目中,为了便于拓展接口,没有直接写成这个样子,但是这样是尽对没题目的  
        // 假如从文件中读取的URL地址最后一个字符不是 '\'，则添加'\'  
        if (OpenOffice_HOME.charAt(OpenOffice_HOME.length() - 1) != '/') {
            OpenOffice_HOME += "/";
        }
        Process pro = null;
        try {
            // 启动OpenOffice的服务  
            String command = OpenOffice_HOME
                    + "program/soffice.exe -headless -accept=\"socket,host=127.0.0.1,port=8100;urp;\"";
            pro = Runtime.getRuntime().exec(command);
            // connect to an OpenOffice.org instance running on port 8100  
            OpenOfficeConnection connection = new SocketOpenOfficeConnection("127.0.0.1", 8100);
            connection.connect();

            // convert  
            DocumentConverter converter = new OpenOfficeDocumentConverter(connection);
            System.out.println(new File("E:\\tt.doc").exists());
            converter.convert(new File("E:\\tt.doc"), new File("E:\\document.pdf"));

            // close the connection  
            connection.disconnect();
            // 封闭OpenOffice服务的进程  
            pro.destroy();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            pro.destroy();
        }
    }


    @Test
    public void testThree() throws IOException {
        byte b[] = "content".toString().getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(b);
        POIFSFileSystem poifs = new POIFSFileSystem();
        DirectoryEntry directory = poifs.getRoot();
        DocumentEntry documentEntry = directory.createDocument("WordDocument", bais);
    }

    @Test
    public void testFour() {
        File file = new File("E:\\test1.doc");
        String str = "";
        try {
            System.out.println(file.exists());
            FileInputStream fis = new FileInputStream(file);
            HWPFDocument doc = new HWPFDocument(fis);
            String doc1 = doc.getDocumentText();
            System.out.println(doc1);
            StringBuilder doc2 = doc.getText();
            System.out.println(doc2);
            Range rang = doc.getRange();
            String doc3 = rang.text();
            System.out.println(doc3);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testFive(){
        POIFSFileSystem fs = null;
        Document document = new Document();

        try {
            System.out.println("Starting the test");
            fs = new POIFSFileSystem(new FileInputStream("E:/gaoxiaoni.docx"));

            HWPFDocument doc = new HWPFDocument(fs);
            WordExtractor we = new WordExtractor(doc);

            OutputStream file = new FileOutputStream(new File("D:/test.pdf"));

            PdfWriter writer = PdfWriter.getInstance(document, file);

            Range range = doc.getRange();
            document.open();
            writer.setPageEmpty(true);
            document.newPage();
            writer.setPageEmpty(true);

            String[] paragraphs = we.getParagraphText();
            for (int i = 0; i < paragraphs.length; i++) {

                org.apache.poi.hwpf.usermodel.Paragraph pr = range.getParagraph(i);
                // CharacterRun run = pr.getCharacterRun(i);
                // run.setBold(true);
                // run.setCapitalized(true);
                // run.setItalic(true);
                paragraphs[i] = paragraphs[i].replaceAll("\\cM?\r?\n", "");
                System.out.println("Length:" + paragraphs[i].length());
                System.out.println("Paragraph" + i + ": " + paragraphs[i].toString());

                // add the paragraph to the document  
                document.add(new Paragraph(paragraphs[i]));
            }

            System.out.println("Document testing completed");
        } catch (Exception e) {
            System.out.println("Exception during test");
            e.printStackTrace();
        } finally {
            // close the document  
            document.close();
        }
    }
    
    @Test
    public void testSix() throws IOException {
        String content = FileUtils.readFileToString(new File("E:/bing.html"),"utf-8");

        byte b[] = content.toString().getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(b);
        POIFSFileSystem poifs = new POIFSFileSystem();
        DirectoryEntry directory = poifs.getRoot();
        DocumentEntry documentEntry = directory.createDocument("WordDocument", bais);
        System.out.println(documentEntry.toString());
        //输出文件流
//      response.reset();
//      response.setHeader("Content-Disposition", "attachment;filename=" + new String( (name + ".doc").getBytes(),"iso-8859-1"));  
//      response.setContentType("application/msword");
//      response.setCharacterEncoding("utf-8");
//      OutputStream ostream = response.getOutputStream();
        //输出到本地文件的话，new一个文件流  
        FileOutputStream ostream = new FileOutputStream(new File("E:/fuck.doc"));
        poifs.writeFilesystem(ostream);
        bais.close();
        ostream.close();
        System.out.println("=====导出word成功！");
    }
    
    @Test
    public void testSeven(){
        int wdDoNotSaveChanges = 0;// 不保存待定的更改。
        int wdFormatPDF = 17;// PDF 格式
        String filename = "E:/aaa.doc";
        String toFilename = "E:/loving.pdf";
        System.out.println("启动Word...");
        long start = System.currentTimeMillis();
        ActiveXComponent app = null;
        try {
            app = new ActiveXComponent("Word.Application");
            app.setProperty("Visible", false);

            Dispatch docs = app.getProperty("Documents").toDispatch();
            System.out.println("打开文档..." + filename);
            Dispatch doc = Dispatch.call(docs,//
                    "Open", //
                    filename,// FileName
                    false,// ConfirmConversions
                    true // ReadOnly
            ).toDispatch();

            System.out.println("转换文档到PDF..." + toFilename);
            File tofile = new File(toFilename);
            if (tofile.exists()) {
                tofile.delete();
            }
            Dispatch.call(doc,//
                    "SaveAs", //
                    toFilename, // FileName
                    wdFormatPDF);

            Dispatch.call(doc, "Close", false);
            long end = System.currentTimeMillis();
            System.out.println("转换完成..用时：" + (end - start) + "ms.");
        } catch (Exception e) {
            System.out.println("========Error:文档转换失败：" + e.getMessage());
            e.printStackTrace();
        } finally {
            if (app != null)
                app.invoke("Quit", wdDoNotSaveChanges);
        }
    }

}
