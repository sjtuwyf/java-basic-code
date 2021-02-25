package shuzu;

public class Test4 {
    public static void main(String[] args) {
        char[] charArray={'a','f','e','g','j','y','t','g','d','v','a','h','t','r','t',};
        printCount(charArray);
    }

    public static void printCount(char[] charArray){
        int[] count = new int[26];
        for (int i = 0; i < charArray.length; i++) {
            int c =charArray[i];
            count[c-97]++;
        }

        for (int i = 0,ch=97; i < count.length; i++,ch++) {
            if(count[i]!=0){
                System.out.println((char)ch+"--"+count[i]);
            }
        }
    }
}
