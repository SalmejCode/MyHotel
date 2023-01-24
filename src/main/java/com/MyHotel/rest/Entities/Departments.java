package com.MyHotel.rest.Entities;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity(name = "Departments")
@Table(name = "Departments")
public class Departments {

    @Id
    @Column(name= "id", nullable = false, unique = true)
    private String id;

    @Column
    private String name;

    @Column
    private int managerId;

    @OneToOne
    @JoinColumn(name = "locations_id", referencedColumnName = "id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Locations locations;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public Locations getLocationsEntity() {
        return locations;
    }

    public void setLocationsEntity(Locations locations) {
        this.locations = locations;
    }
}
