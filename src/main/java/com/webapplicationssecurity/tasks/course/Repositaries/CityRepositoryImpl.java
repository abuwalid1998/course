package com.webapplicationssecurity.tasks.course.Repositaries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.webapplicationssecurity.tasks.course.Models.City;

@Repository
public class CityRepositoryImpl implements CityRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<City> findAll() {
        String sql = "SELECT * FROM city";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(City.class));
    }

    @Override
    public City findById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void save(City city) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void update(City city) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}