package itcast.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * account表 删除一条记录
 */
public class JDBCDemo4 {

    public static void main(String[] args) {
        Connection conn = null;

        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");

            String sql = "delete from account  where id =3";

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
