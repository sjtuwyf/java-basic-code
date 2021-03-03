package stream;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙");
        String[] strings = stream.filter(s -> s.startsWith("黄")).toArray(String[]::new);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
