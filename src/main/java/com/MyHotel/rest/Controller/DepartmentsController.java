package com.MyHotel.rest.Controller;


import com.MyHotel.rest.Dto.DepartmentSegmentSalaryDTO;
import com.MyHotel.rest.Service.IDepartments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("MyHotelAPI/Departments")
public class DepartmentsController {

    @Autowired(required = true)
    private IDepartments iDepartments;


    @GetMapping("/segmentA")
    public ResponseEntity<?> getDepartmentsSalaryA(){

        List<DepartmentSegmentSalaryDTO> departmentSegmentSalaryList = iDepartments.getDepartmentsSalaryA();

        return new ResponseEntity<>(departmentSegmentSalaryList, HttpStatus.OK) ;
    }

    @GetMapping("/segmentB")
    public ResponseEntity<?> getDepartmentsSalaryB(){

        List<DepartmentSegmentSalaryDTO> departmentSegmentSalaryList = iDepartments.getDepartmentsSalaryB();

        return new ResponseEntity<>(departmentSegmentSalaryList, HttpStatus.OK) ;
    }

    @GetMapping("/segmentC")
    public ResponseEntity<?> getDepartmentsSalaryC(){

        List<DepartmentSegmentSalaryDTO> departmentSegmentSalaryList = iDepartments.getDepartmentsSalaryC();

        return new ResponseEntity<>(departmentSegmentSalaryList, HttpStatus.OK) ;
    }

    @GetMapping("/SalaryAVGDepartment")
    public ResponseEntity<?> getSalaryDepartmentConditional(){

        return new ResponseEntity<>(iDepartments.getSalaryDepartmentConditional(), HttpStatus.OK) ;
    }
}
