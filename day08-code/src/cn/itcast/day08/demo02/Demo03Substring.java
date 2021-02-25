package cn.itcast.day08.demo02;

public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(2);
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("==================");

        String str3 = str1.substring(4,7);
        System.out.println(str3);

        System.out.println("==================");

        String strA = "Hello";
        System.out.println(strA);
        strA = "Java";
        System.out.println(strA);
    }
}
