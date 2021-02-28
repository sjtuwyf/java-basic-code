package cn.itcast.day11.demo03;

public class Body {
    private String name = "abc";

    public class Heart{
        public void beat(){
            System.out.println("peng peng peng");
            System.out.println(name);
        }
    }


    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().beat();
    }
}
