package com.MyHotel.rest.Entities;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity(name = "Automobile")
@Table(name = "Automobile")
public class Automobile {

    @Id
    @Column(name= "id", nullable = false, unique = true)
    private String id;

    @Column
    private String automobileType;

    @Column
    private int doorsNumber;

    @Column
    private int passengerCapacity;

    @Column
    private int trunkCapacity;

    @OneToOne
    @JoinColumn(name = "vehicles_id", referencedColumnName = "id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Vehicles vehicles;

}
