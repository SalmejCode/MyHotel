package com.MyHotel.rest.Dto;

public class DepartmentSegmentSalaryDTO {

    public DepartmentSegmentSalaryDTO(){

    }

    public DepartmentSegmentSalaryDTO(Integer employeesNumber, String departmentName){
        this.employeesNumber = employeesNumber;
        this.departmentName = departmentName;
    }

    private Integer employeesNumber;

    private String departmentName;

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
