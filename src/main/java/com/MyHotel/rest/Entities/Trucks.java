package com.MyHotel.rest.Entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity(name = "Trucks")
@Table(name = "Trucks")
public class Trucks {

    @Id
    @Column(name= "id", nullable = false, unique = true)
    private String id;

    @Column
    private String truckType;

    @Column
    private int tonCapacity;

    @Column
    private int numberOfAxles;

    @OneToOne
    @JoinColumn(name = "vehicles_id", referencedColumnName = "id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Vehicles vehicles;

}
