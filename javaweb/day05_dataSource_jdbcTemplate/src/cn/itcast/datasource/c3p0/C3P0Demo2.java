package cn.itcast.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * c3p0演示
 */
public class C3P0Demo2 {

    public static void main(String[] args) throws SQLException {
//        ComboPooledDataSource ds = new ComboPooledDataSource();
//
//        for (int i = 0; i < 11 ; i++) {
//            Connection conn = ds.getConnection();
//            System.out.println((i+1)+":"+conn);
//
//            if(i==5){
//                conn.close();
//            }
//        }




        testNameConfig();
    }

    public static void testNameConfig() throws SQLException {

        ComboPooledDataSource ds = new ComboPooledDataSource("otherc3p0");

        for (int i = 0; i < 10 ; i++) {
            Connection conn = ds.getConnection();
            System.out.println((i+1)+":"+conn);


        }


    }
}
