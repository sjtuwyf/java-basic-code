package cn.itcast.proxy;

public class Lenovo implements SaleComputer {
    @Override
    public String sale(double money) {
        System.out.println(money+" ");
        return "lenovo";
    }

    @Override
    public void show() {
        System.out.println("show...");
    }
}
