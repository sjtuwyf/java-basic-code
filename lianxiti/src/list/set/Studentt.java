package list.set;

public class Studentt {
    private String name;
    private int age;
    private float score;

    @Override
    public String toString() {
        return "Studentt{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
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

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Studentt(String name, int age, float score) {

        this.name = name;
        this.age = age;
        this.score = score;
    }
}
