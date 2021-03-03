package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test0001 {
    public static void main(String[] args) {
        Stream<String> streamA = Stream.of("郭靖", "杨康");
        Stream<String> streamB = Stream.of("黄蓉", "穆念慈");
        List<String> stringList = Stream.concat(streamA, streamB).collect(Collectors.toList());
        for (String s : stringList) {
            System.out.println(s);
        }

    }
}
