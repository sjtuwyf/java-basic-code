package com.itheima.dao.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class ItemsDaoImpl implements ItemsDao {
    public List<Items> findAll() throws Exception {


        List<Items> list = new ArrayList<Items>();

        Connection connection = null;
        PreparedStatement pst = null;
        ResultSet rs = null;


        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql:///maven","root","root");



            pst = connection.prepareCall("SELECT * from items");


            rs = pst.executeQuery();




            while (rs.next()) {

                Items items = new Items();
                items.setId(rs.getInt("id"));
                items.setName(rs.getString("name"));
                list.add(items);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            rs.close();
            pst.close();
            connection.close();
        }

        return list;
    }
}
