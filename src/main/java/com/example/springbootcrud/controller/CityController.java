package com.example.springbootcrud.controller;

import com.example.springbootcrud.model.City;
import com.example.springbootcrud.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {


    @Autowired
    CityService cityService;

    @GetMapping("api/city")
    public ResponseEntity<?>getAllCity(){
        return new ResponseEntity<List<City>>(this.cityService.getAllCity(), HttpStatus.OK);
    }

}
