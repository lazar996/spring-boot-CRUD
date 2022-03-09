package com.example.springbootcrud.controller;

import com.example.springbootcrud.dto.CityDTO;
import com.example.springbootcrud.model.City;
import com.example.springbootcrud.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {


    @Autowired
    CityService cityService;

    @GetMapping("api/city")
    public ResponseEntity<?>getAllCity(){
        return new ResponseEntity<List<City>>(this.cityService.getAllCity(), HttpStatus.OK);
    }

    @GetMapping(value = "api/city/{id}")
    public ResponseEntity<City> getCityById(@PathVariable(value = "id")Long id){
        return new ResponseEntity<City>(this.cityService.getCityById(id),HttpStatus.OK);
    }
    @PostMapping(value = "api/city")
    public ResponseEntity<City> createCity(@RequestBody CityDTO cityDTO){
        return new ResponseEntity<City>(this.cityService.createCity(cityDTO),HttpStatus.CREATED);
    }
    @DeleteMapping(value = "api/city/{id}")
    public ResponseEntity<City>deleteCity(@PathVariable( "id") Long id){
        cityService.deleteById(id);
        return new ResponseEntity<City>(HttpStatus.OK);
    }
    @PutMapping(value = "api/city/{id}")
    public ResponseEntity<City> editCity(@RequestBody CityDTO cityDTO, @PathVariable(value = "id") Long id){

        if(cityDTO.getId() == null){

            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        City updateCity = cityService.updateCity(cityDTO, id);

        return new ResponseEntity<>(updateCity,HttpStatus.OK);
    }

}
