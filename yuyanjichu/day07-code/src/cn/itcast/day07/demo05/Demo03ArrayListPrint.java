package cn.itcast.day07.demo05;

import java.util.ArrayList;

public class Demo03ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        printArrayList(list);

    }

    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i!=list.size()){
                System.out.print("@");
            }
        }
        System.out.print("}");
    }
}
