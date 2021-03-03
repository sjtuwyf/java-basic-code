package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");

        list1.add("0");
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        list1.add("6");
        list1.add("7");
        list1.add("8");
        list1.add("9");

        list.stream().limit(3).forEach(System.out::println);

        list1.stream().skip(list1.size()-5).forEach(System.out::println);

        Stream<String> concat = Stream.concat(list.stream().limit(5), list1.stream().limit(5));

        List<String> collect = concat.collect(Collectors.toList());

        List<File> collect1 = Stream.concat(list.stream(), list1.stream()).map(File::new).collect(Collectors.toList());
    }
}
