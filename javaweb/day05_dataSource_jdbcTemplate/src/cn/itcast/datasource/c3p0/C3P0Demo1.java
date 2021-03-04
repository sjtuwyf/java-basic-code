package cn.itcast.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * c3p0的演示
 */
public class C3P0Demo1 {

    public static void main(String[] args) throws SQLException {
        ComboPooledDataSource ds = new ComboPooledDataSource();

        Connection conn = ds.getConnection();

        System.out.println(conn);
    }
}

