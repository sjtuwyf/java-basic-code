package stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        Stream<String> parallelStream = coll.parallelStream();
        Stream<Integer> parallel = Stream.of(100, 200, 300, 400).parallel();
    }
}
