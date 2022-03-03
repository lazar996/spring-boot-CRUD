package com.example.springbootcrud.repository;

import com.example.springbootcrud.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<Country, Long> {

    public Country findCountryById(Long id);
}
