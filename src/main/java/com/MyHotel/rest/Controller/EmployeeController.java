package com.MyHotel.rest.Controller;


import com.MyHotel.rest.Dto.EmployeeInfoDTO;
import com.MyHotel.rest.Dto.EmployeesCountrySalaryDetailDTO;
import com.MyHotel.rest.Dto.NumberPerSegmentDTO;
import com.MyHotel.rest.Entities.Employees;
import com.MyHotel.rest.Service.IEmployees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("MyHotelAPI/Employees")
public class EmployeeController {

    @Autowired(required = true)
    private IEmployees iEmployees;


    @GetMapping("/segmentA")
    public ResponseEntity<?> getEmployeesSalaryA(){

        NumberPerSegmentDTO numberPerSegmentDTO = iEmployees.getEmployeesSalaryA();

        return new ResponseEntity<>(numberPerSegmentDTO, HttpStatus.OK) ;
    }

    @GetMapping("/segmentB")
    public ResponseEntity<?> getEmployeesSalaryB(){

        NumberPerSegmentDTO numberPerSegmentDTO = iEmployees.getEmployeesSalaryB();

        return new ResponseEntity<>(numberPerSegmentDTO, HttpStatus.OK) ;
    }

    @GetMapping("/segmentC")
    public ResponseEntity<?> getEmployeesSalaryC(){

        NumberPerSegmentDTO numberPerSegmentDTO = iEmployees.getEmployeesSalaryC();

        return new ResponseEntity<>(numberPerSegmentDTO, HttpStatus.OK) ;
    }

    @GetMapping("/EmployeeMaxSalaryPerDeparment")
    public ResponseEntity<?> getEmployeeInfoMaxSalaryDepartmentDTOList(){

        List<EmployeeInfoDTO> employeeDepartmentDTO = iEmployees.getEmployeeInfoMaxSalaryDepartmentDTOList();

        return new ResponseEntity<>(employeeDepartmentDTO, HttpStatus.OK) ;
    }

    @GetMapping("/EmployeeByTenure")
    public ResponseEntity<?> getTenuredEmployees(){

        List<Employees> employeeList = iEmployees.getTenuredEmployees();

        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @GetMapping("/EmployeeGroupByCountrySalaryDetailTenure")
    public ResponseEntity<?> getEmployeeCountrySalaryTenure(){

        List<EmployeesCountrySalaryDetailDTO> employeeList = iEmployees.getEmployeeCountrySalaryTenure();

        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }


}
