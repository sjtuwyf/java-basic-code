package stream;

import java.util.stream.Stream;

public class Test001 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, -2, -3, 4, -5);

        stream.map(Math::abs).forEach(System.out::println);
    }
}
