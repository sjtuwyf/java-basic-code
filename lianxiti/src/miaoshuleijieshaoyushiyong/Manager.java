package miaoshuleijieshaoyushiyong;

public class Manager {
    private String name;
    private String ID;
    private int[] salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int[] getSalary() {
        return salary;
    }

    public void setSalary(int[] salary) {
        this.salary = salary;
    }

    public Manager() {

    }

    public Manager(String name, String ID, int[] salary) {

        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    public void intro(){
        System.out.println(name+ID);
    }

    public void showSalary(){
        System.out.println(salary[0]+" "+salary[1]);
    }

    public void work(){
        System.out.println("work");
    }
}
