package com.MyHotel.rest.Service;

import com.MyHotel.rest.Dto.DepartmentSegmentSalaryDTO;
import com.MyHotel.rest.Dto.SalaryAVGperDepartMoreThan2EmployeesDTO;
import com.MyHotel.rest.Entities.Departments;

import java.util.List;
import java.util.Optional;

public interface IDepartments {

    List<Departments> getDepartments();

    Optional<Departments> getDepartmentById(int id);

    List<DepartmentSegmentSalaryDTO> getDepartmentsSalaryA();

    List<DepartmentSegmentSalaryDTO> getDepartmentsSalaryB();

    List<DepartmentSegmentSalaryDTO> getDepartmentsSalaryC();

    List<SalaryAVGperDepartMoreThan2EmployeesDTO> getSalaryDepartmentConditional();

}
