package cn.itcast.day11.demo04;

public class MyOuter {

    public void methodOuter(){
        int num = 10;

        class MyInner{
            public void methidInner(){
                System.out.println(num);
            }
        }
    }
}
