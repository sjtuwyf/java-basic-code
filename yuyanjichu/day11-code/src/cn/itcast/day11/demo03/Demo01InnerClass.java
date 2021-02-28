package cn.itcast.day11.demo03;

public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();

        Body.Heart heart = new Body().new Heart();

        heart.beat();
    }
}
