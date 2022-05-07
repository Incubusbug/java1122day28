package com.offcn.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.offcn.bean.Product;
import com.offcn.dao.ProductDao;
import com.offcn.dao.ProductDaoIml;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productname = request.getParameter("productname");//获得数据
        ProductDao pd = new ProductDaoIml();
        List<Product> list = pd.selectProductByName(productname);//调用方法
        response.setContentType("text/html;charset=utf-8");//设置编码
        PrintWriter writer = response.getWriter();//返回响应给客户端
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(list);//将数组转为字符串类型
        writer.println(s);
    }
}
