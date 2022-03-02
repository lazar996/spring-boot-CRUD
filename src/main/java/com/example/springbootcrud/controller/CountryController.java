package com.example.springbootcrud.controller;

import com.example.springbootcrud.model.Country;
import com.example.springbootcrud.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {


    @Autowired
    CountryService countryService;

    @GetMapping("api/country")
    public ResponseEntity<?>getAllCountry(){

        return new ResponseEntity<List<Country>>(this.countryService.getAllCountry(), HttpStatus.OK);
    }
}
