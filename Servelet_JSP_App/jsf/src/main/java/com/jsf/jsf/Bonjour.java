package com.jsf.jsf;


import jakarta.inject.Named;

@Named
public class Bonjour {
    private String bonjour="BONJOUR !!!!!!!";

    public String getBonjour() {
        return bonjour;
    }

    public void setBonjour(String bonjour) {
        this.bonjour = bonjour;
    }
    public String getMessage() {
        return bonjour;
    }
}