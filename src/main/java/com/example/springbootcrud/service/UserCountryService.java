package com.example.springbootcrud.service;

import com.example.springbootcrud.model.UserCountry;
import com.example.springbootcrud.repository.UserCountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCountryService {

    @Autowired
    UserCountryRepo userCountryRepo;

    public List<UserCountry> getAllUserCountryAddress(){
        return userCountryRepo.findAll();
    }
}
