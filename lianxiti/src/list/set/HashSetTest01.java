package list.set;

import java.util.HashSet;

public class HashSetTest01 {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();

        hashSet.add(new Person("a", 18));
        hashSet.add(new Person("b", 18));
        hashSet.add(new Person("c", 19));
        hashSet.add(new Person("d", 20));
        hashSet.add(new Person("c", 19));
        hashSet.add(new Person("d", 20));

        for (Person person : hashSet) {
            System.out.println(person);
        }
    }
}
