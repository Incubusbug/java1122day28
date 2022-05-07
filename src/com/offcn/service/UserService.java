package com.offcn.service;

import com.offcn.bean.City;
import com.offcn.bean.Country;
import com.offcn.bean.User;

import java.util.List;

public interface UserService {
    int insertUser(User user);
    User CheckUsername(String username);
    List<City> selectCityByCountryId(int countryId);
    List<Country> selectAllCountry();
}
