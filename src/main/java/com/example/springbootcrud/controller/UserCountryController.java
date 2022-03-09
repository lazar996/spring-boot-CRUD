package com.example.springbootcrud.controller;

import com.example.springbootcrud.model.UserCountry;
import com.example.springbootcrud.repository.UserCountryRepo;
import com.example.springbootcrud.service.UserCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserCountryController {

    @Autowired
    UserCountryService userCountryService;

    @GetMapping("api/user_country")
    ResponseEntity<?> getAllUserCountry(){

        return  new ResponseEntity<List<UserCountry>>(this.userCountryService.getAllUserCountryAddress(), HttpStatus.OK);
    }


}
