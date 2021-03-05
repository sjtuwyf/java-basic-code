package cn.itcast.jdbctemplate;

import cn.itcast.utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;


/**
 * JdbcTemplate入门
 */
public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

        String sql = "update account set balance = 5000 where id = ?";

        int update = template.update(sql, 4);

        System.out.println(update);
    }



}
