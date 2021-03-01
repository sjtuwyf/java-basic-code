package collection;

import java.util.ArrayList;

public class CollectionTest06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        int i = list.indexOf(1);
        System.out.println(i);
        System.out.println(listTest(list,-1));
    }

    public static int listTest(ArrayList<Integer> al,Integer s){
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).equals(s)){
                return i;
            }
        }
        return -1;
    }
}
