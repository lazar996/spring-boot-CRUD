package com.example.springbootcrud.controller;

import com.example.springbootcrud.model.Address;
import com.example.springbootcrud.model.City;
import com.example.springbootcrud.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping(value = "api/address")
    public ResponseEntity<?> getAllAddress(){

        return new ResponseEntity<List<Address>>(this.addressService.getAddress(), HttpStatus.OK);
    }

    @GetMapping(value = "api/address/{id}")
    public ResponseEntity<Address> getAddressById(@PathVariable(value = "id")Long id){

        return new ResponseEntity<Address>(this.addressService.getAddressById(id),HttpStatus.OK);
    }

}
