package cn.itcast.day08.demo02;

public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",b");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("========================");

        String str2 = "aaa,bbb,ccc";
        String[] array2 = str1.split(",");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println("========================");

        String str3 = "aaa.bbb.ccc";
        String[] array3 = str1.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

        System.out.println("========================");
    }
}
