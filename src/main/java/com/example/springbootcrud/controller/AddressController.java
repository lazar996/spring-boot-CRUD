package com.example.springbootcrud.controller;

import com.example.springbootcrud.model.Address;
import com.example.springbootcrud.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("api/address")
    public ResponseEntity<?> getAllAddress(){

        return new ResponseEntity<List<Address>>(this.addressService.getAddress(), HttpStatus.OK);
    }

}
