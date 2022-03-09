package com.example.springbootcrud.service;

import com.example.springbootcrud.dto.CountryDTO;
import com.example.springbootcrud.model.City;
import com.example.springbootcrud.model.Country;
import com.example.springbootcrud.repository.CityRepo;
import com.example.springbootcrud.repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    CountryRepo countryRepo;

    @Autowired
    CityRepo cityRepo;

    public List<Country> getAllCountry(){

        return  countryRepo.findAll();
    }

    public Country getCountryById(Long id){
        return countryRepo.findCountryById(id);
    }

    public Country createCountry(CountryDTO countryDTO){

        City city = cityRepo.findCityById(countryDTO.getCapital());

        Country country = new Country();
        country.setName(countryDTO.getName());
        country.setFlagUrl(countryDTO.getFlagUrl());
        country.setShortCode(countryDTO.getShortCode());
        country.setCapital(city);

        return countryRepo.save(country);
    }

    public Country updateCountry(CountryDTO countryDTO,Long id){
         Country country = countryRepo.findCountryById(id);
         City city = cityRepo.getById(country.getCapital().getId());

         country.setFlagUrl(countryDTO.getFlagUrl());
         country.setName(countryDTO.getName());
         country.setShortCode(countryDTO.getShortCode());
         country.setCapital(city);
        return countryRepo.save(country);
    }

    public void deleteCountry(Long id){

        countryRepo.deleteById(id);
    }
}
