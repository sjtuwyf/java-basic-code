import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsoupDemo02 {

    public static void main(String[] args) throws IOException {

//        String path = JsoupDemo02.class.getClassLoader().getResource("student.xml").getPath();

//        Document document = Jsoup.parse(new File(path), "utf-8");
//        System.out.println(document);
//        Elements elements = document.getElementsByTag("name");
//        System.out.println(elements.size());
//        Element element = elements.get(0);
//        String text = element.text();
//        System.out.println(text);
//
//        String str = "\n" +
//                "<students>\n" +
//                " \t<!--</student>-->\n" +
//                "\t<student number=\"heima_1234\">\n" +
//                "\t\t<name>sdf</name>\n" +
//                "\t\t<age>111</age>\n" +
//                "\t\t<sex>female</sex>\n" +
//                "\t</student>\n" +
//                "\t\n" +
//                "\t<student number=\"heima_2345\">\n" +
//                "\t\t<name>sad</name>\n" +
//                "\t\t<age>12</age>\n" +
//                "\t\t<sex>male</sex>\n" +
//                "\t</student>\n" +
//                "\t\t \n" +
//                " </students>";
//        Document document = Jsoup.parse(str);
//        System.out.println(document);
        URL url = new URL("https://segmentfault.com/a/1190000037454375");
        Document document = Jsoup.parse(url, 10000);
        System.out.println(document);


    }
}
