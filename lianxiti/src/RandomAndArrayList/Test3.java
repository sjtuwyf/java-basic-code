package RandomAndArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(83, 72, 83, 83, 77, 75, 72, 72, 67, 65);
        List<Integer> list = new ArrayList<>(list1);
//        list.add;
//        List<Integer> list = new ArrayList<>()
        System.out.println(findIndex(list, 77));
        replace(list, 72, 27);

//        System.out.println(list.toArray());
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }


    }

    public static int findIndex(List<Integer> list, int i) {
//        List list1 = new List(list);
        int index = -1;
//        list.add(1);
        for (int i1 = 0; i1 < list.size(); i1++) {
            if (list.get(i1) == i) {
                index = i1;
                break;
            }
        }
        return index;
    }

    public static void replace(List<Integer> list, int oldValue, int newValue) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == oldValue) {
                list.set(i, newValue);
            }
        }
    }
}
