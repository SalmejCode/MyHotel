package com.MyHotel.rest.Dto;

import com.MyHotel.rest.Entities.Employees;

public class EmployeeDepartmentDTO {

    public EmployeeDepartmentDTO() {
    }

    public EmployeeDepartmentDTO(Employees employees, String departmentName) {
        this.employees = employees;
        this.departmentName = departmentName;
    }

    private Employees employees;

    private String departmentName;

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
