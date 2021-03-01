package collection;

import java.util.ArrayList;

public class CollectionTest04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("itcast");
        list.add("itcast");
        list.add("i");
        System.out.println(listTest(list,"i"));
    }

    public static boolean listTest(ArrayList<String> al,String s){
        if (al.contains(s)){
            return true;
        }
        return false;
    }
}
