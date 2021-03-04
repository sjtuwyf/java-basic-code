package itcast.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * account表 添加一条记录 insert 语句
 */
public class JDBCDemo2 {

    public static void main(String[] args)  {

        Statement stmt = null;
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String sql = "insert into account values (null,'王五',3000)";

            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");

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
