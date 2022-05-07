package com.offcn.dao;

import com.offcn.bean.City;
import com.offcn.bean.Country;

import java.util.List;

public interface CityDao {
  List<City> selectCityByCountryId(int countryId);
}
