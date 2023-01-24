package com.MyHotel.rest.Entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Employees")
@Table(name = "Employees")
public class Employees {


    @Id
    @Column(name= "id", nullable = false, unique = true)
    private String id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PHONE_NAME")
    private String phoneName;

    @Column(name="HIRE_DATE")
    private Date hireDate;

    @OneToOne
    @JoinColumn(name = "JOBS_ID", referencedColumnName = "id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Jobs Jobs;

    @Column(name="SALARY")
    private Long salary;

    @Column(name="COMMISSIONPCT")
    private Long commissionPCT;

    @Column(name="MANAGER_ID")
    private int managerId;

    @OneToOne
    @JoinColumn(name = "DEPARTMENTS_ID", referencedColumnName = "id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Departments departments;




}
