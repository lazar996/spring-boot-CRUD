package com.example.springbootcrud.service;

import com.example.springbootcrud.model.Address;
import com.example.springbootcrud.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    public List<Address> getAddress(){

        return addressRepo.findAll();
    }
}
