package com.MyHotel.rest.Service.Imp;

import com.MyHotel.rest.Daos.EmployeesDao;
import com.MyHotel.rest.Dto.EmployeeDepartmentDTO;
import com.MyHotel.rest.Dto.EmployeeInfoDTO;
import com.MyHotel.rest.Dto.EmployeesCountrySalaryDetailDTO;
import com.MyHotel.rest.Dto.NumberPerSegmentDTO;
import com.MyHotel.rest.Entities.Employees;
import com.MyHotel.rest.Service.IEmployees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesImp implements IEmployees {

    @Autowired
    EmployeesDao dao;

    @Override
    public List<Employees> getEmployees() {
        return dao.getEmployees();
    }

    @Override
    public Optional<Employees> getEmployeesById(int id) {
        return dao.getEmployeesById(id);
    }

    @Override
    public NumberPerSegmentDTO getEmployeesSalaryA() {
        return dao.employeesCountBySalarySegmentA();
    }

    @Override
    public NumberPerSegmentDTO getEmployeesSalaryB() {
        return dao.employeesCountBySalarySegmentB();
    }

    @Override
    public NumberPerSegmentDTO getEmployeesSalaryC() {
        return dao.employeesCountBySalarySegmentC();
    }

    @Override
    public List<EmployeeInfoDTO> getEmployeeInfoMaxSalaryDepartmentDTOList() {
        return dao.getEmployeesInfoMaxSalaryDepartment();
    }

    @Override
    public List<Employees> getTenuredEmployees() {
        return dao.getTenuredEmployees();
    }

    @Override
    public List<EmployeesCountrySalaryDetailDTO> getEmployeeCountrySalaryTenure() {
        return dao.getEmployeeCountrySalaryTenureCondition();
    }


}
