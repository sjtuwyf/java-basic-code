package cn.itcast.day10.demo06;


public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouth();
        }
        giveMeAPet(new Cat());
    }

    public static void giveMeAPet(Animal animal){
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouth();
        }
    }
}
