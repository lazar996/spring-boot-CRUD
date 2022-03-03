package com.example.springbootcrud.service;

import com.example.springbootcrud.model.City;
import com.example.springbootcrud.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    CityRepo cityRepo;

    public List<City> getAllCity(){

        return cityRepo.findAll();
    }
    public void deleteById(Long id){
        cityRepo.deleteById(id);
    }

    public City getCityById(Long id){
        return cityRepo.findCityById(id);
    }
}
