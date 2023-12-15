package com.project.daangn.post.entity;

import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;

@Builder
@Getter
@Embeddable
public class Location {

    @NotNull
    private Double longitude;

    @NotNull
    private Double latitude;

    public Location(){}
    public Location(Double longitude, Double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

}
