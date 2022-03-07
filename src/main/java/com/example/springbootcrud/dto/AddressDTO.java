package com.example.springbootcrud.dto;

import java.io.Serializable;

public class AddressDTO implements Serializable {

    private Long id;
    private String street;
    private Integer number;
    private Long city_id;


    public AddressDTO(Long id, String street, Integer number, Long city_id) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.city_id = city_id;
    }

    public AddressDTO() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getCity_id() {
        return city_id;
    }

    public void setCity_id(Long city_id) {
        this.city_id = city_id;
    }
}
