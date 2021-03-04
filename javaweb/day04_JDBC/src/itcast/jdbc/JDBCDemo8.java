package itcast.jdbc;

import itcast.domain.Emp;
import itcast.util.JDBCUtils;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * * 定义一个方法，查询emp表的数据将其封装为对象，然后装载集合，返回。
 */
public class JDBCDemo8 {


    public static void main(String[] args) {
        List<Emp> list = new JDBCDemo8().findAll2();
        System.out.println(list);
        System.out.println(list.size());
    }

    public List<Emp> findAll(){

        Connection conn = null;

        Statement stmt = null;


        ResultSet rs = null;

        ArrayList<Emp> list = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");

            String sql = "select * from emp";

            stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);

            Emp emp = null;
            list = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                emp = new Emp();

                emp.setId(id);
                emp.setName(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);


                list.add(emp);


            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    public List<Emp> findAll2(){

        Connection conn = null;

        Statement stmt = null;


        ResultSet rs = null;

        ArrayList<Emp> list = null;

        try {
//            Class.forName("com.mysql.jdbc.Driver");
//
//            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");

            conn = JDBCUtils.getConnection();

            String sql = "select * from emp";

            stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);

            Emp emp = null;
            list = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                emp = new Emp();

                emp.setId(id);
                emp.setName(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);


                list.add(emp);


            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs,stmt,conn);
        }
        return list;
    }

}
