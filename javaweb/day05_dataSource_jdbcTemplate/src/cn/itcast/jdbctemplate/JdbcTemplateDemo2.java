package cn.itcast.jdbctemplate;


import cn.itcast.domain.Emp;
import cn.itcast.utils.JDBCUtils;
import com.alibaba.druid.sql.visitor.SQLASTOutputVisitorUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JdbcTemplateDemo2 {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());


    @Test
    public void test1(){



        String sql ="update emp set salary = 9999 where id = 1001";

        int update = template.update(sql);

        System.out.println(update);
    }

    @Test
    public void test2() {
        String sql ="insert into emp(id,ename,dept_id) values(?,?,?)";

        int i = template.update(sql, 1015, "郭靖", 10);
        System.out.println(i);
    }


    @Test
    public void test3() {
        String sql ="DELETE FROM emp WHERE id=?";

        int i = template.update(sql, 1015);
        System.out.println(i);
    }

    @Test
    public void test4( ) {
        String sql ="SELECT  * FROM emp WHERE id = ? /*OR id = ?*/";

        Map<String, Object> map = template.queryForMap(sql, 1001/*, 1002*/);
        System.out.println(map);
    }

    @Test
    public void test5() {
        String sql ="SELECT  * FROM emp ";

        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
    }

    @Test
    public void test6() {
        String sql ="SELECT  * FROM emp ";

        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                Emp emp = new Emp();

                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                return emp;
            }
        });

        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    @Test
    public void test6_2() {
        String sql ="SELECT  * FROM emp ";

        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));


        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    @Test
    public void test7() {
        String sql ="SELECT count(id) FROM emp ";

        Long total = template.queryForObject(sql, long.class);


        System.out.println(total);
    }


}
