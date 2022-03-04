package com.example.springbootcrud.controller;

import com.example.springbootcrud.model.Country;
import com.example.springbootcrud.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping(value = "api/country")
    public ResponseEntity<?>getAllCountry(){
        return new ResponseEntity<List<Country>>(this.countryService.getAllCountry(), HttpStatus.OK);
    }

    @RequestMapping(value = "api/country/{id}", method = RequestMethod.GET)
    public ResponseEntity<Country> getCountryById(@PathVariable(value = "id") Long id){
        return new ResponseEntity<Country>(this.countryService.getCountryById(id), HttpStatus.OK );
    }

    @PostMapping(value = "api/country")
    public ResponseEntity<Country> createCountry(@RequestBody Country country){

        return new ResponseEntity<Country>(this.countryService.createCountry(country),HttpStatus.CREATED);
    }
    @PutMapping(value = "api/country")
    public ResponseEntity<Country> updateCountry(@RequestBody Country country){

        return new ResponseEntity<Country>(this.countryService.updateCountry(country),HttpStatus.ACCEPTED);
    }

    @DeleteMapping(value = "api/country/{id}")
    public ResponseEntity<Country> deleteCountry(@PathVariable(value = "id") Long id){

        countryService.deleteCountry(id);
        return  new ResponseEntity<Country>(HttpStatus.OK);
    }
}
