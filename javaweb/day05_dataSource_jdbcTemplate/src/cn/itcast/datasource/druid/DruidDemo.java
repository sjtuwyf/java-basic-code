package cn.itcast.datasource.druid;



import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * Druid演示
 */
public class DruidDemo {

    public static void main(String[] args) throws Exception {


        Properties properties = new Properties();
        InputStream inputStream = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");


        properties.load(inputStream);

        DataSource ds = DruidDataSourceFactory.createDataSource(properties);

        Connection conn = ds.getConnection();

        System.out.println(conn);
    }

}
