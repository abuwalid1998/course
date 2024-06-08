package com.webapplicationssecurity.tasks.course.Repositaries;

import java.util.List;

import com.webapplicationssecurity.tasks.course.Models.City;

public interface CityRepository {
    List<City> findAll();
    City findById(int id);
    void save(City city);
    void update(City city);
    void delete(int id);
}