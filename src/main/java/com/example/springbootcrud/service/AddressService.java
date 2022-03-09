package com.example.springbootcrud.service;

import com.example.springbootcrud.dto.AddressDTO;
import com.example.springbootcrud.model.Address;
import com.example.springbootcrud.model.City;
import com.example.springbootcrud.repository.AddressRepo;
import com.example.springbootcrud.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    @Autowired
    CityRepo cityRepo;

    public List<Address> getAddress(){

        return addressRepo.findAll();
    }

    public Address getAddressById(Long id){
       return addressRepo.findAddressById(id);
    }

    public void deleteAddressById(Long id){ addressRepo.deleteById(id);}

    public Address createAddress(AddressDTO addressDTO){

        City city = cityRepo.findCityById(addressDTO.getCity_id());
        Address address = new Address();
        address.setStreet(addressDTO.getStreet());
        address.setNumber(addressDTO.getNumber());
        address.setCity(city);

        return addressRepo.save(address);
    }

    public Address updateAddress(AddressDTO addressDTO, Long id){

        Address address = addressRepo.findAddressById(id);
        City city = cityRepo.findCityById(address.getCity().getId());
        address.setStreet(addressDTO.getStreet());
        address.setNumber(addressDTO.getNumber());
        address.setCity(city);

        return addressRepo.save(address);

    }
}
