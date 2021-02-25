package Math;

import java.util.ArrayList;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true){
            if(scanner.nextInt()==1){
                list.add(scanner.next());
            }else {
                break;
            }
        }
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------------");
        del(list);

        System.out.println(list);

    }

    public static void del(ArrayList<String> list){
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(s.length()>5){
                list1.add(s);
            }
        }

        for (String s : list1) {
            list.remove(s);
        }
    }


}
