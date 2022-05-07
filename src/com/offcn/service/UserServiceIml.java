package com.offcn.service;

import com.offcn.bean.City;
import com.offcn.bean.Country;
import com.offcn.bean.User;
import com.offcn.dao.*;

import java.util.List;

public class UserServiceIml implements UserService{
    UserDao ud = new UserDaoIml();
    CityDao cd = new CityDaoIml();
    CountryDao ct = new CountryDaoIml();
    @Override
    public int insertUser(User user) {
        return ud.insertUser(user);
    }

    @Override
    public User CheckUsername(String username) {
        return ud.CheckUsername(username);
    }

    @Override
    public List<City> selectCityByCountryId(int countryId) {
        return cd.selectCityByCountryId(countryId);
    }

    @Override
    public List<Country> selectAllCountry() {
        return ct.selectAllCountry();
    }
}
