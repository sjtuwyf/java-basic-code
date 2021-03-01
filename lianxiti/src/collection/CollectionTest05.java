package collection;

import java.util.ArrayList;

public class CollectionTest05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        System.out.println(listTest(list));
    }

    public static boolean listTest(ArrayList<String> al){
        if(al.isEmpty()){
            return true;
        }
        return false;
    }
}
