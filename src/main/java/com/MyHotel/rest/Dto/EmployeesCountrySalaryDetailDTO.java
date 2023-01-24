package com.MyHotel.rest.Dto;

public class EmployeesCountrySalaryDetailDTO {

    public EmployeesCountrySalaryDetailDTO() {
    }

    public EmployeesCountrySalaryDetailDTO(int employeesPerCountry, String salaryName, double avgSalaryPerCountry, long maxSalary, long minSalary) {
        this.employeesPerCountry = employeesPerCountry;
        this.salaryName = salaryName;
        this.avgSalaryPerCountry = avgSalaryPerCountry;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    private int employeesPerCountry;
    private String salaryName;
    private double avgSalaryPerCountry;
    private long maxSalary;
    private long minSalary;

    public int getEmployeesPerCountry() {
        return employeesPerCountry;
    }

    public void setEmployeesPerCountry(int employeesPerCountry) {
        this.employeesPerCountry = employeesPerCountry;
    }

    public String getSalaryName() {
        return salaryName;
    }

    public void setSalaryName(String salaryName) {
        this.salaryName = salaryName;
    }

    public double getAvgSalaryPerCountry() {
        return avgSalaryPerCountry;
    }

    public void setAvgSalaryPerCountry(double avgSalaryPerCountry) {
        this.avgSalaryPerCountry = avgSalaryPerCountry;
    }

    public long getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(long maxSalary) {
        this.maxSalary = maxSalary;
    }

    public long getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(long minSalary) {
        this.minSalary = minSalary;
    }
}
