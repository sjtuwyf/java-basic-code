package cn.itcast.day08.demo02;

public class Demo02StringGet {
    public static void main(String[] args) {

        int length = "sdafsafwefweafwefwefwaefwefwa".length();
        System.out.println(length);

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println("==============================");

        char ch = "Hello".charAt(1);
        System.out.println(ch);

        System.out.println("===============================");

        String original = "sfdafefaadfegrgr";
        int index = original.indexOf("grdsa");
        System.out.println(index);


    }
}
