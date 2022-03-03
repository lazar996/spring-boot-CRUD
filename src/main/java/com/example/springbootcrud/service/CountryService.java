package com.example.springbootcrud.service;

import com.example.springbootcrud.model.Country;
import com.example.springbootcrud.repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    CountryRepo countryRepo;

    public List<Country> getAllCountry(){

        return  countryRepo.findAll();
    }

    public Country getCountryById(Long id){
        return countryRepo.findCountryById(id);
    }

    public Country createCountry(Country country){

        return countryRepo.save(country);
    }

    public Country updateCountry(Country country){
        return countryRepo.save(country);
    }

    public void deleteCountry(Long id){

        countryRepo.deleteById(id);
    }
}
