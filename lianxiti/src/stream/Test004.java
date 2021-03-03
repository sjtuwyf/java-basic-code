package stream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Test004 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        Stream<String> stream = list.stream();
        Stream<String> limit = stream.limit(2);
        limit.forEach(System.out::println);

        list.stream().skip(list.size() - 2).forEach(System.out::println);



    }
}
