package com.example.springbootcrud.dto;

import java.io.Serializable;

public class CountryDTO implements Serializable {

    private Long id;
    private String name;
    private String flagUrl;
    private String shortCode;
    private Long capital;

    public CountryDTO(Long id, String name, String flagUrl, String shortCode, Long capital) {
        this.id = id;
        this.name = name;
        this.flagUrl = flagUrl;
        this.shortCode = shortCode;
        this.capital = capital;
    }

    public CountryDTO() {
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

    public String getFlagUrl() {
        return flagUrl;
    }

    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public Long getCapital() {
        return capital;
    }

    public void setCapital(Long capital) {
        this.capital = capital;
    }

}
