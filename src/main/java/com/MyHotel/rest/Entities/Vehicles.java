package com.MyHotel.rest.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Vehicles")
@Table(name = "Vehicles")
public class Vehicles {

    @Id
    @Column(name= "id", nullable = false, unique = true)
    private String id;

    @Column
    private String brand;

    @Column
    private String model;

    @Column
    private String patent;

    @Column
    private int year;

    @Column
    private long kilometers;

    @Column
    private int displacement;
}
