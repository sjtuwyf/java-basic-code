package Math;

public class Test9 {

    public static void main(String[] args) {
        System.out.println(isV("qweRY123"));
    }

    public static boolean isV(String pwd) {
        int length = pwd.length();
        if (length < 8) {
            return false;
        }
        int count =0;
        for (int i = 0; i < length; i++) {
            char c = pwd.charAt(i);
            if(c>'A'&&c<'Z'){
                count++;
            }
            if((c<'0'||c>'9')&&(c<'a'||c>'z')&&(c<'A'||c>'Z')){
                return false;
            }
        }
        if (count<2){
            return false;
        }
        return true;


    }
}
