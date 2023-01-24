package com.MyHotel.rest.Entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Maintenance")
@Table(name = "Maintenance")
public class Maintenance {

    @Id
    @Column(name= "id", nullable = false, unique = true)
    private String id;

    @Column
    private String description;

    @Column
    private Date startingDate;

    @Column
    private Date finishinggDate;

    @ManyToOne
    @JoinColumn(name = "vehicles_id", referencedColumnName = "id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Vehicles vehicles;
}
