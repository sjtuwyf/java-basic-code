import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsoupDemo03 {

    public static void main(String[] args) throws IOException {


        String path = JsoupDemo03.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");


        Elements elements = document.getElementsByTag("student");

        String number = elements.get(0).attr("number");
        System.out.println(number);

        String text = elements.get(1).text();
        System.out.println(text);


    }
}
