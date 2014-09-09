package com.javacodegeeks.snippets.enterprise.model;

/**
 * Created by Kuba on 2014-09-08.
 */

public class Address {

    private long addressID;
    private String street;
    private long postcode;
    private String city;

    public Address(){
    }

    public Address(long id_address, String street, long post_code, String city) {
        super();
        this.addressID = id_address;
        this.street = street;
        this.postcode = post_code;
        this.city = city;
    }

    public long getId_address() {
        return addressID;
    }

    public void setId_address(long id_address) {
        this.addressID = id_address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public long getPost_code() {
        return postcode;
    }

    public void setPost_code(long post_code) {
        this.postcode = post_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
