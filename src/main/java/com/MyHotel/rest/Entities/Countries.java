package com.MyHotel.rest.Entities;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity(name = "Countries")
@Table(name = "Countries")
public class Countries {

    @Id
    @Column(name= "id", nullable = false, unique = true)
    private String id;

    private String countryName;

    @OneToOne
    @JoinColumn(name = "regions_id", referencedColumnName = "id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Regions regions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Regions getRegionsEntity() {
        return regions;
    }

    public void setRegionsEntity(Regions regions) {
        this.regions = regions;
    }
}
