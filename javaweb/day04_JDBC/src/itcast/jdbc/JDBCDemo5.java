package itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 执行DDL语句
 */
public class JDBCDemo5 {
    public static void main(String[] args) {
        Connection conn = null;

        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");

            String sql = "CREATE TABLE student (id int, name VARCHAR(20))";

            stmt = conn.createStatement();

            int i = stmt.executeUpdate(sql);

            System.out.println(i);

            if (i > 0) {
                System.out.println("ok");
            } else {
                System.out.println("not");
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
