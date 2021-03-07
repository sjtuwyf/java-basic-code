import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo04 {

    public static void main(String[] args) throws IOException {


        String path = JsoupDemo04.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");


        Elements elements = document.getElementsByTag("student");

        String number = elements.get(0).attr("number");
        System.out.println(number);

        String text = elements.get(1).text();
        System.out.println(text);

        String html = elements.html();
        System.out.println(html);


    }
}
