package com.MyHotel.rest.Dto;

public class EmployeeInfoDTO {

    public EmployeeInfoDTO() {
    }

    public EmployeeInfoDTO(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    private String firstName;

    private String lastName;

    private String email;
}
