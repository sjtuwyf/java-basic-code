package RandomAndArrayList;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(verifyCode());
        }
    }

    public static String verifyCode(){
//        char[] arr = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','','','','','','','','','','','','','','',};
        String s = new String();
        for (int i = 0; i < 10; i++) {
            s=s+(char)(48+i);
        }
        for (int i = 0; i < 26; i++) {
            s+=(char)(65+i);
        }
        for (int i = 0; i < 26; i++) {
            s+=(char)(97+i);
        }
        char[] chars = s.toCharArray();
        Random random = new Random();
        String s1 = new String();
        for (int i = 0; i < 6; i++) {
            s1+=chars[random.nextInt(chars.length)];
        }

        return s1;

    }




}
