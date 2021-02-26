package Math;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(next);
        String s = reverseStr(next);
        System.out.println(s);

//        System.out.println(reverseStr(next));
//        for (int i = 0; i < next.length(); i++) {
//            System.out.print(reverseStr(next).toCharArray()[i]);
//        }
    }

    public static String reverseStr(String str){
//        String s = new String();
//        System.out.println(str);
        System.out.println(str);
        char[] chars = str.toCharArray();
        System.out.println(chars);
//        System.out.println(chars);
        for (int i = 0; i < chars.length-1-i; i++) {
//            if(i>=chars.length-1-i){
//                break;
//            }
            char c=chars[i];
            chars[i]=chars[chars.length-1-i];
            chars[chars.length-1-i]=c;

        }

        return new String(chars);
    }

}
