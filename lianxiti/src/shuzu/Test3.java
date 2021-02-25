package shuzu;

public class Test3 {
    public static void main(String[] args) {
        String[] puke = getPuke();
        int num1 = 12;
        int num2 = 33;
        int num3 = 45;

        String[] pk3=get3(puke,num1,num2,num3);
        for (int i = 0; i < pk3.length; i++) {
            System.out.println(pk3[i]);
        }
    }

    public static String[] getPuke() {
        String[] color = {"黑桃", "红桃", "梅花", "方片"};
        String[] nums = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] puke = new String[54];

        int index = 0;
        for (int i = 0; i < color.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {
                puke[index] = color[i] + nums[i1];
                index++;
            }
        }
        puke[52]="小王";
        puke[53]="大王";

        return puke;
    }

    public static String[] get3(String[] puke,int n1,int n2,int n3){
        String[] pk3=new String[3];
        pk3[0]=puke[n1];
        pk3[1]=puke[n2];
        pk3[2]=puke[n3];
        return pk3;
    }
}
