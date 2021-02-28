package cn.itcast.day11.demo08;


//import cn.itcast.day11.red.RedPacketFrame;

import cn.itcast.day11.red.OpenMode;

public class Boostrap {

    public static void main(String[] args) {
        MyRed red = new MyRed("kechang") ;

        red.setOwnerName("a");

//        OpenMode normal = new NormalMode();
//
//        red.setOpenWay(normal);


        OpenMode random =new RandomMode();
        red.setOpenWay(random);


    }

}
