package com.example.springbootcrud.service;

import com.example.springbootcrud.model.Address;
import com.example.springbootcrud.model.City;
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

    public Address getAddressById(Long id){
       return addressRepo.findAddressById(id);
    }

    public void deleteAddressById(Long id){ addressRepo.deleteById(id);}

    public Address createAddress(Address address){
        return addressRepo.save(address);
    }
}
