package yichang.xiancheng;

public class Person {
    private String name;
    private int lifeValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if (lifeValue < 0) {
            throw new NoLifeValueException("生命值不能为负");
        }
        this.lifeValue = lifeValue;
    }

    public Person() {

    }

    public Person(String name, int lifeValue) {
        super();
//        this.name = name;
//        this.lifeValue = lifeValue;
    }
}
