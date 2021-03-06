package com.example.springbootcrud.repository;

import com.example.springbootcrud.model.Address;
import com.example.springbootcrud.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address,Long> {

    public Address findAddressById(Long id);
}
