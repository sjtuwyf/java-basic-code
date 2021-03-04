package itcast.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * JDBC工具类
 */
public class JDBCUtils {

    private static String url;
    private static String user;
    private static String password;
    private static String driver;

    static {



        try {
            Properties properties = new Properties();
//            properties.load(new FileReader("D:\\IdeaProjects\\basic-code\\javaweb\\day04_JDBC\\src\\jdbc.properties"));

            ClassLoader classLoader = JDBCUtils.class.getClassLoader();

            URL res = classLoader.getResource("jdbc.properties");

            String path = res.getPath();
//            System.out.println(path);


            properties.load(new FileReader(path));

            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            driver = properties.getProperty("driver");

            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(url, user, password);
    }

    public static void close(Statement stmt,Connection conn) {

        if (stmt !=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn !=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs,Statement stmt, Connection conn) {


        if (rs !=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (stmt !=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn !=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
