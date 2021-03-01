package collection;

import java.util.ArrayList;

public class CollectionTest07 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("a", 18, "man"));
        list.add(new Student("a", 17, "man"));
        list.add(new Student("a", 19, "man"));
        print(list);
        change(list);
        print(list);
    }

    private static void change(ArrayList<Student> list) {
        int num =0;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge()>list.get(num).getAge()){
                num=i;
            }
        }

        list.get(num).setName("peiqi");
    }

    public static void print(ArrayList<Student> list){
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
