package com.MyHotel.rest.Entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "JobHistory")
@Table(name = "JobHistory")
public class JobHistory {

    @Id
    @Column(name= "id", nullable = false, unique = true)
    private String id;

    @OneToOne
    @JoinColumn(name = "employees_id", referencedColumnName = "id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Employees Employees;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @OneToOne
    @JoinColumn(name = "jobs_id", referencedColumnName = "id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Jobs Jobs;

    @OneToOne
    @JoinColumn(name = "deparments_id", referencedColumnName = "id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Departments departments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Employees getEmployeesEntity() {
        return Employees;
    }

    public void setEmployeesEntity(Employees employees) {
        Employees = employees;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Jobs getJobsEntity() {
        return Jobs;
    }

    public void setJobsEntity(Jobs jobs) {
        Jobs = jobs;
    }

    public Departments getDepartmentsEntity() {
        return departments;
    }

    public void setDepartmentsEntity(Departments departments) {
        this.departments = departments;
    }
}
