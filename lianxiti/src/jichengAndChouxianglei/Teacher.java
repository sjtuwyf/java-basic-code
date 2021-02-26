package jichengAndChouxianglei;

public class Teacher extends Person {

    private String teach;

    public Teacher(String name, int age, String teach) {
        super(name, age);
        this.teach = teach;
    }

    public Teacher(String teach) {
        this.teach = teach;
    }

    public String getTeach() {
        return teach;
    }

    public void setTeach(String teach) {
        this.teach = teach;
    }

    public void teachF(){
        System.out.println(getName()+teach);
    }


}
