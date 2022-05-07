package com.offcn.servlet;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.offcn.bean.User;
import com.offcn.service.UserService;
import com.offcn.service.UserServiceIml;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( "/CheckUsername")
public class CheckUsername extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=utf-8");
       String username = request.getParameter("username");
        UserService us = new UserServiceIml();
        User user = us.CheckUsername(username);
        PrintWriter writer = response.getWriter();
        if(user == null){
            writer.println("yes");
        }else {
            writer.println("no");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
