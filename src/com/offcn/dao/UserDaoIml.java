package com.offcn.dao;

import com.offcn.bean.User;
import com.offcn.util.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDaoIml implements UserDao {
    @Override
    public int insertUser(User user) {
        int result = 0;
        QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "insert into user value(null,?,?,?,?)";
        try {
          result = qr.update(sql,user.getUsername(),user.getPassword(),user.getTelephone(),user.getBirthday());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public User CheckUsername(String username) {
        User user = null;
        QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "select * from user where username = ?";
        try {
           user = qr.query(sql,new BeanHandler<>(User.class),username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
