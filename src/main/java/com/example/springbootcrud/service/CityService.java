package com.example.springbootcrud.service;

import com.example.springbootcrud.dto.CityDTO;
import com.example.springbootcrud.model.City;
import com.example.springbootcrud.model.Country;
import com.example.springbootcrud.repository.CityRepo;
import com.example.springbootcrud.repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    CityRepo cityRepo;

    @Autowired
    CountryRepo countryRepo;

    public List<City> getAllCity(){

        return cityRepo.findAll();
    }
    public void deleteById(Long id){
        cityRepo.deleteById(id);
    }

    public City getCityById(Long id){
        return cityRepo.findCityById(id);
    }

    public City createCity(CityDTO cityDTO){

        Country country = countryRepo.getById(cityDTO.getCountry_id());
        City city = new City();
        city.setName(cityDTO.getName());
        city.setPostalCode(cityDTO.getPostalCode());
        city.setCountry(country);

        return cityRepo.save(city);
    }
}
