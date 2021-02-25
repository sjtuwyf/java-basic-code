package cn.itcast.day09.demo09;

public class Zi extends Fu {
    int num  = 20;

    public Zi() {
        this(123);
    }

    public Zi(int n) {
    }
    public void show(){
        int num=10;
        System.out.println(num);
        System.out.println(this.num);

        System.out.println(super.num);
    }

    public void showA(){
        System.out.println("AAA");
    }

    public void showB(){
        this.showA();
        System.out.println("BBB");
    }
}
