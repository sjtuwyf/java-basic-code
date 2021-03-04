package cn.itcast.datasource.druid;

import cn.itcast.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 使用新的工具类
 */
public class DruidDemo2 {


    public static void main(String[] args) {

        Connection conn = null;

        PreparedStatement pstmt = null;

        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into account values(null,?,?)";

            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, "王五");
            pstmt.setDouble(2, 3000);

            int i = pstmt.executeUpdate();
            System.out.println(i);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(pstmt,conn);
        }
    }

}
