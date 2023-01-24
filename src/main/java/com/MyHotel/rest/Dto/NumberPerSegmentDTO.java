package com.MyHotel.rest.Dto;

public class NumberPerSegmentDTO {

    public NumberPerSegmentDTO() {

    }
    public NumberPerSegmentDTO(int number) {
        this.number = number;
    }

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
