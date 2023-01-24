package com.MyHotel.rest.Entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity(name = "Locations")
@Table(name = "Locations")
public class Locations {

    @Id
    @Column(name= "id", nullable = false, unique = true)
    private String id;

    @Column
    private String streetAddress;

    @Column
    private String postalCode;

    @Column
    private String city;

    @Column
    private String stateProvince;

    @OneToOne
    @JoinColumn(name = "countries_id", referencedColumnName = "id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Countries countries;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public Countries getCountriesEntity() {
        return countries;
    }

    public void setCountriesEntity(Countries countries) {
        this.countries = countries;
    }
}
