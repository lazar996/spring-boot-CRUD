package com.example.springbootcrud.controller;

import com.example.springbootcrud.dto.AddressDTO;
import com.example.springbootcrud.model.Address;
import com.example.springbootcrud.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "api/address")
    public ResponseEntity<Address> createAddress(@RequestBody AddressDTO addressDTO){
        return  new ResponseEntity<Address>(this.addressService.createAddress(addressDTO),HttpStatus.CREATED);
    }
    @DeleteMapping("api/address/{id}")
    public ResponseEntity<Address> deleteAddressById(@PathVariable("id") Long id){

        addressService.deleteAddressById(id);
        return new ResponseEntity<Address>(HttpStatus.OK);
    }

}
