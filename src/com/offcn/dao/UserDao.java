package com.offcn.dao;

import com.offcn.bean.User;

public interface UserDao {
   int insertUser(User user);

   User CheckUsername(String username);
}
