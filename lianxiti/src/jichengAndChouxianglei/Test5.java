package jichengAndChouxianglei;

import java.util.ArrayList;

public class Test5 {

    public static void main(String[] args) {
        SUV suv1 = new SUV(5079, 750000);
        SUV suv2 = new SUV(4813, 760000);
        SUV suv3 = new SUV(4270, 127800);
        SUV suv4 = new SUV(4545, 188800);

        ArrayList<SUV> list = new ArrayList<>();
        list.add(suv1);
        list.add(suv2);
        list.add(suv3);
        list.add(suv4);

        for (int i = 0; i < list.size(); i++) {
            SUV suv = list.get(i);
            if (suv.midleSUV()){
                suv.showMsg();
            }
        }
    }

}
