package com.project.daangn.post.entity;

import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@Embeddable
public class Address {
    private String state;
    private String city;
    private String town;

    public Address(){}

    public Address(String state, String city, String town){
        this.state = state;
        this.city = city;
        this.town = town;
    }

}
