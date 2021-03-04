package itcast.jdbc;

import java.sql.*;

/**
 * 执行DDL语句
 */
public class JDBCDemo7 {
    public static void main(String[] args) {
        Connection conn = null;

        Statement stmt = null;

        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");

            String sql = "SELECT * FROM account";

            stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);

//            boolean next = rs.next();
//            System.out.println(next);
//
//            int id = rs.getInt(1);
//            String name = rs.getString("name");
//            double balance = rs.getDouble(3);
//
//            System.out.println(id+"-----"+name+"-----"+balance);

            while (rs.next() == true) {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);

                System.out.println(id+"-----"+name+"-----"+balance);
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

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
