package cn.itcast.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void recieve(ArrayList<Integer> list) {
        int index = new Random().nextInt(list.size());
        int delta = list.remove(index);

        int money = super.getMoney();
        super.setMoney(money + delta);
    }
}
