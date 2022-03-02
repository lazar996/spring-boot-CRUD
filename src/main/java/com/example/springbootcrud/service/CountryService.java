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
}
