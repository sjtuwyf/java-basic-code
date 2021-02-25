package fangfachongzai;

public class Test2 {
    public static void main(String[] args) {
        boolean b1 =doCheck(2);
        boolean b2 =doCheck(3);
        System.out.println(b1);
        System.out.println(b2);

    }

    public static boolean doCheck(int num) {
        boolean flag;
        if(num%2==0){
            for (int i = 0; i <= 20; i++) {
                num-=i;
            }
            flag = true;
        } else {
            for (int i = 0; i <= 20; i++) {
                num+=i;
            }
            flag=false;
        }
        System.out.println(num);
        return flag;
    }
}
