package cn.day06.itcast.demo01;

public class Demo03PhonSame {
    public static void main(String[] args) {
        Phone one = new Phone();

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        System.out.println("==================================");

        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "黑色";

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        System.out.println("==================================");

        one.call("乔布斯");
        one.sendMessage();

        Phone two = one;

        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        System.out.println("==================================");

        two.brand = "小米";
        two.price = 1999.0;
        two.color = "白色";

        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        System.out.println("==================================");

        two.call("雷军");
        two.sendMessage();
    }
}
