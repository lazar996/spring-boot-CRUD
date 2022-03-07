package com.example.springbootcrud.repository;

import com.example.springbootcrud.model.UserCountry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCountryRepo  extends JpaRepository<UserCountry , Long> {
}
