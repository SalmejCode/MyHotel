package com.MyHotel.rest.Service;

import com.MyHotel.rest.Dto.EmployeeDepartmentDTO;
import com.MyHotel.rest.Dto.EmployeeInfoDTO;
import com.MyHotel.rest.Dto.EmployeesCountrySalaryDetailDTO;
import com.MyHotel.rest.Dto.NumberPerSegmentDTO;
import com.MyHotel.rest.Entities.Employees;

import java.util.List;
import java.util.Optional;

public interface IEmployees {

    List<Employees> getEmployees();

    Optional<Employees> getEmployeesById(int id);

    NumberPerSegmentDTO  getEmployeesSalaryA();

    NumberPerSegmentDTO  getEmployeesSalaryB();

    NumberPerSegmentDTO  getEmployeesSalaryC();

    List<EmployeeInfoDTO>  getEmployeeInfoMaxSalaryDepartmentDTOList();

    List<Employees> getTenuredEmployees();

    List<EmployeesCountrySalaryDetailDTO> getEmployeeCountrySalaryTenure();
}
