import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lmy on 2017/6/9.
 */
public class TestRegex {

    @Test
    public void test1() {
        int i = Pattern.UNIX_LINES;
        i = Pattern.DOTALL;
        i = Pattern.MULTILINE;
        i = Pattern.COMMENTS;
        i = Pattern.CASE_INSENSITIVE;
        i = Pattern.UNICODE_CASE;
        i = Pattern.CANON_EQ;
        i = Pattern.LITERAL;
    }

    @Test
    public void test2() {
        String myText = "this is my 1st test string";
        String myRegex = "\\d+\\w+";
        Pattern p = Pattern.compile(myRegex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher m = p.matcher(myText);

        if (m.find()) {
            String matchedText = m.group();
            int matchedFrom = m.start();
            int matchedTo = m.end();
            System.out.println("mytched[" + matchedText + "]" + "from" + matchedFrom + "to" + matchedTo + ".");
        } else {
            System.out.println("didn't match");
        }
    }

    @Test
    public void test3() {
        //language=JSRegexp
        String regex = "\\w+";
        String text = "Mastering Regular Expressions";
        Matcher m = Pattern.compile(regex).matcher(text);

        if (m.find()) {
            System.out.println("match [" + m.group() + "]");
        }

    }

    @Test
    public void test4() {
        String url = "http://regex.info/blog";
        String regex = "(?x) ^(https?):// ([^/:]+) (?:(\\d+))?";

        Matcher m = Pattern.compile(regex).matcher(url);

        if (m.find()) {
            System.out.println(
                    "Overall [" + m.group() + "]" +
                            "(from" + m.start(1) + "to" + m.end() + ")\n" +
                            "Proto"
            );
        }
    }

    @Test
    public void test5() {
        String text = "Before Java 1.5 was Java 1.4.2 After Java 1.5 is Java 1.6";
        String regex = "\\bJava\\s*1\\.5\\b";
        Matcher m = Pattern.compile(regex).matcher(text);
        String result = m.replaceAll("Java 5.0");
        System.out.println(result);
    }

    @Test
    public void test6() {
        StringBuilder text = new StringBuilder("It's SO very RUDE to shout!");
        Matcher m = Pattern.compile("\\b[\\p{Lu}\\p{Lt}]+\\b").matcher(text);
        while (m.find()) {
            text.replace(m.start(), m.end(), m.group().toLowerCase());
        }
        System.out.println(text);
    }

    @Test
    public void test7() {
        StringBuilder text = new StringBuilder("It's SO very RUDE to shout!");
        Matcher m = Pattern.compile("\\b[\\p{Lu}\\p{Lt}]+\\b").matcher(text);
        int matchPointer = 0;
        while (m.find(matchPointer)) {
            matchPointer = m.end();
            text.replace(m.start(), m.end(), "<b>" + m.group().toLowerCase() + "</b>");
            matchPointer += 7;
        }
        System.out.println(text);
    }

    @Test
    public void test8() {  //先查找img标签，然后确定好范围之后，使用标签的index范围 查找alt
        Matcher mImg = Pattern.compile("(?id)<IMG\\s+(.*?)/?>").matcher("html");
        Matcher mAlt = Pattern.compile("(?ix)\\b ALT \\s* =").matcher("html");

        while (mImg.find()) {
            mAlt.region(mImg.start(1), mImg.end(1));
            if (!mAlt.find()) {
                System.out.println("Missing ALT attribute in: " + mImg.group());
            }
        }
    }

    @Test
    public void test9() {
        Matcher mImg = Pattern.compile("(?id)<IMG\\s+(.*?)/?>").matcher("html");
        Matcher mAlt = Pattern.compile("(?ix)\\b ALT \\s* = ").matcher("html");

        Matcher mLine = Pattern.compile("\\n").matcher("html");

        while (mImg.find()) {
            mAlt.region(mImg.start(1), mImg.end(1));

            if (!mAlt.find()) {
                mLine.region(0, mImg.start());
                int lineNum = 1;
                while (mLine.find()) {
                    lineNum++;
                }

                System.out.println("Missing ALT attribute on line" + lineNum);
            }
        }
    }

    @Test
    public void test10() {
        String regex = "\\bcar\\b";
        String text = "Madagascar is best seen by car or bike.";
        Matcher m = Pattern.compile(regex).matcher(text);
        m.region(7, text.length());
        m.useTransparentBounds(true);  //防止region欺骗正则引擎
        m.find();
        System.out.println("Matches starting at character " + m.start());
    }

    final Pattern pNeverFail = Pattern.compile("^");

    @Test
    public void test11() {
        Matcher m = null;
        Integer regionStart = m.regionStart();
        Integer regionEnd = m.regionEnd();
        Pattern pattern = m.pattern();

        String text = m.usePattern(pNeverFail).replaceFirst("");

        m.usePattern(pattern).region(regionStart, regionEnd);
    }

    @Test
    public void test12() throws IOException {
        Matcher mImg = Pattern.compile("(?id)<IMG\\s+(.*?)/?>").matcher("html");
        Matcher mSrc = Pattern.compile("(?ix)\\\\bSRC =(\\S+)").matcher("html)");
        Matcher mWidth = Pattern.compile("(?ix)\\bWIDTH=(\\S+)").matcher("html");
        Matcher mHeight = Pattern.compile("(?ix)\\bHEIGHT=(\\S+)").matcher("html");

        int imgMatchPointer = 0;
        while (mImg.find(imgMatchPointer)) {
            imgMatchPointer = mImg.end();
            Boolean hasSrc = mSrc.region(mImg.start(1), mImg.end(1)).find();
            Boolean hasHeight = mHeight.region(mImg.start(1), mImg.end(1)).find();
            Boolean hasWidth = mWidth.region(mImg.start(1), mImg.end(1)).find();

            if (hasSrc && (!hasWidth || !hasHeight)) {
                BufferedImage i = ImageIO.read(new URL(mSrc.group(1)));

                String size;
                if (hasWidth) {
                    size = "height='" + (int) (Integer.parseInt(mWidth.group(1)) * i.getHeight() / i.getWidth()) + "' ";
                } else if (hasHeight) {
                    size = "width='" + (int) (Integer.parseInt(mHeight.group(1)) * i.getWidth() / i.getHeight()) + " '";
                } else {
                    size = "width='" + i.getWidth() + "' " + "height='" + i.getHeight() + "' ";
                }

                new StringBuffer("html").insert(mImg.start(1), size);
                imgMatchPointer += size.length();
            }
        }
    }
}
