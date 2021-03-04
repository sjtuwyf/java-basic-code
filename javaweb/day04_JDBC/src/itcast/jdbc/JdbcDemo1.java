package itcast.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC快速入门
 * @author ssqswyf
 */
public class JdbcDemo1 {

    public static void main(String[] args) throws Exception {

//        Class.forName("com.mysql.jdbc.Driver");

//        Class.forName("com.mysql.jdbc.Driver");

//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");

//        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db3", "root", "root");

        Connection conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");

       String sql = "update account set balance = 4500 where id = 1";

        Statement stmt = conn.createStatement();

        int count = stmt.executeUpdate(sql);

        System.out.println(count);

        stmt.close();

        conn.close();
    }

}
