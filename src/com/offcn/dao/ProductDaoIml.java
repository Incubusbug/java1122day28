package com.offcn.dao;

import com.offcn.bean.Product;
import com.offcn.util.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ProductDaoIml implements ProductDao {
    @Override
    public List<Product> selectProductByName(String productname) {
        List<Product> list = null;
        QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "select * from product where productname like ?";
        try {
           list= qr.query(sql,new BeanListHandler<>(Product.class),"%"+productname+"%");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
