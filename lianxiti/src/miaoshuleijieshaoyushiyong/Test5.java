package miaoshuleijieshaoyushiyong;

public class Test5 {
    public static void main(String[] args) {
        Manager m = new Manager("a", "9527", new int[]{30000, 10000});
        m.intro();
        m.showSalary();
        m.work();
        System.out.println("------------------------------");
        Coder c = new Coder("b", "1234", 25000);
        c.intro();
        c.showSalary();
        c.work();
    }
}
