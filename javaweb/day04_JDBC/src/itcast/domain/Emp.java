package itcast.domain;

import java.util.Date;

/**
 * 封装Emp表数据的JavaBean
 */
public class Emp {
    private int id;
    private String name;
    private int job_id;
    private  int mgr;
    private Date joindate;
    private double salary;
    private double bonus;
    private  int dept_id;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job_id=" + job_id +
                ", mgr=" + mgr +
                ", joindate=" + joindate +
                ", salary=" + salary +
                ", bounds=" + bonus +
                ", dept_id=" + dept_id +
                '}';
    }

    public Emp() {
    }

    public Emp(int id, String name, int job_id, int mgr, Date joindate, double salary, double bonus, int dept_id) {

        this.id = id;
        this.name = name;
        this.job_id = job_id;
        this.mgr = mgr;
        this.joindate = joindate;
        this.salary = salary;
        this.bonus = bonus;
        this.dept_id = dept_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getMgr() {
        return mgr;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;

    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }
}
