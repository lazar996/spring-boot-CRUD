package com.example.springbootcrud.dto;

import java.io.Serializable;

public class CityDTO implements Serializable {

    private Long id;
    private String name;
    private String postalCode;
    private Long country_id;

    public CityDTO() {
    }

    public CityDTO(Long id, String name, String postalCode, Long country_id) {
        this.id = id;
        this.name = name;
        this.postalCode = postalCode;
        this.country_id = country_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Long country_id) {
        this.country_id = country_id;
    }
}
