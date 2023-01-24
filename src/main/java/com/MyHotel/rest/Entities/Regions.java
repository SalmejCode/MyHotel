package com.MyHotel.rest.Entities;

import javax.persistence.*;


@Entity(name = "Regions")
@Table(name = "Regions")
public class Regions {


    @Id
    @Column(name= "id", nullable = false, unique = true)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String regionName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }





}
