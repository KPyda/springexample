package com.javacodegeeks.snippets.enterprise.model;

import javax.persistence.*;

/**
 * Created by Kuba on 2014-09-08.
 */
@Entity
@Table(name = "ADDRESS")
public class Address {
    @Id
    @Column(name = "ID_ADDRESS", nullable = false)
    private long id_address;
    @Column(name = "STREET", nullable = false)
    private String street;
    @Column(name = "POST_CODE", nullable = false)
    private long post_code;
    @Column(name = "CITY", nullable = false)
    private String city;

    public long getId_address() {
        return id_address;
    }

    public void setId_address(long id_address) {
        this.id_address = id_address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public long getPost_code() {
        return post_code;
    }

    public void setPost_code(long post_code) {
        this.post_code = post_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
