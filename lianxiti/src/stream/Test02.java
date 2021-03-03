package stream;

import neibulei.Student;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list1.add("qdw");
        list1.add("sd");
        list1.add("arg");
        list1.add("asdf");
        list1.add("sd");
        list1.add("sf");
        list1.add("reg");
        list1.add("egr");
        list1.add("dg");
        list1.add("fgd");

        list2.add("gsd");
        list2.add("shf");
        list2.add("erg");
        list2.add("ehtr");
        list2.add("sdf");
        list2.add("reg");
        list2.add("rgfd");
        list2.add("erw");
        list2.add("wegf");

        Stream<String> limit = list1.stream().filter(s -> s.length() == 3).limit(6);

        Stream<String> skip = list2.stream().filter(s -> s.startsWith("s")).skip(1);

        Stream.concat(limit,skip).map(Student::new).forEach(System.out::print);

    }
}
