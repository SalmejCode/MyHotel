package com.MyHotel.rest.Entities;

import javax.persistence.*;

@Entity(name = "Jobs")
@Table(name = "Jobs")
public class Jobs {

    @Id
    @Column(name= "id", nullable = false, unique = true)
    private String id;

    @Column
    private String jobTitle;

    @Column
    private long minSalary;

    @Column
    private long maxSalary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public long getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(long minSalary) {
        this.minSalary = minSalary;
    }

    public long getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(long maxSalary) {
        this.maxSalary = maxSalary;
    }
}
