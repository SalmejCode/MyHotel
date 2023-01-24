package com.MyHotel.rest.Dto;

public class SalaryAVGperDepartMoreThan2EmployeesDTO {

    public SalaryAVGperDepartMoreThan2EmployeesDTO() {
    }

    public SalaryAVGperDepartMoreThan2EmployeesDTO(int counter, int departmentId, String departmentName, double salaryAVG) {
        this.counter = counter;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.salaryAVG = salaryAVG;
    }

    private int counter;
    private int departmentId;
    private String departmentName;
    private double salaryAVG;



}
