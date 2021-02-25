package Math;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        while (true){

        System.out.println(checkQQ(new Scanner(System.in).next()));
        }
    }

    public static boolean checkQQ(String QQ){
        int length = QQ.length();
        if(length<5||length>12||QQ.startsWith("0")){
            return false;
        }
        for (int i = 0; i < QQ.length(); i++) {
            char c = QQ.charAt(i);
            if(c<'0'||c>'9'){
                return false;
            }
        }
        return true;




    }
}
