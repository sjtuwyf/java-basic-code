package cn.itcast.day11.demo06;

public class Hero {

    public void attack(){
        System.out.println(age+" "+name+" "+weapon.getCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Hero(String name, int age, Weapon weapon) {

        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }

    public Hero() {

    }

    private String name;
    private int age;
    private Weapon weapon;



}
