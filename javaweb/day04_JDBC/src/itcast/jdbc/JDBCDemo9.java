package itcast.jdbc;

import itcast.util.JDBCUtils;

import javax.sound.midi.Soundbank;
import java.sql.*;
import java.util.Scanner;

/**
 * 练习：
 * * 需求：
 * 1. 通过键盘录入用户名和密码
 * 2. 判断用户是否登录成功
 */
public class JDBCDemo9 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        boolean login = new JDBCDemo9().login(username, password);
        if (login) {
            System.out.println("ok");
        } else {
            System.out.println("not");
        }


    }

    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }

        Connection coon = null;
        PreparedStatement pstmt = null;
//                Statement stmt = null;
        ResultSet rs = null;


        try {
            coon = JDBCUtils.getConnection();

//            String sql = "select * from user where username = '" + username + "'and password = '" + password + "'";

            String sql = "select * from user where username = ? and password = ?";

//            stmt = coon.createStatement();
//
//            rs = stmt.executeQuery(sql);

            pstmt = coon.prepareStatement(sql);

            pstmt.setString(1,username);
            pstmt.setString(2,password);


            rs = pstmt.executeQuery();


            return rs.next();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            JDBCUtils.close(rs, pstmt, coon);
        }


        return false;
    }


}
