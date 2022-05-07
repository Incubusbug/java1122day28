package com.offcn.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataSourceUtils {
    private static ComboPooledDataSource ds;
    // 获取数据源
    public static DataSource getDataSource() {
        ds = new ComboPooledDataSource();
        return ds;
    }
    // 获取数据库连接
    public static Connection getConnection() {
        Connection conn = null;
        try {
            DataSource ds = getDataSource();
            conn = ds.getConnection();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void close(ResultSet rs, Statement st, Connection conn) {
        if(rs!=null) {
            try {
                rs.close();
            } catch (SQLException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(st!=null) {
            try {
                st.close();
            } catch (SQLException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
