package com.example.springbootcrud.repository;

import com.example.springbootcrud.model.City;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepositoryImplementation<City, Long> {
}
