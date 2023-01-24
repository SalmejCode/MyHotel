package com.MyHotel.rest.Service.Imp;

import com.MyHotel.rest.Daos.DepartmentsDao;
import com.MyHotel.rest.Dto.DepartmentSegmentSalaryDTO;
import com.MyHotel.rest.Dto.SalaryAVGperDepartMoreThan2EmployeesDTO;
import com.MyHotel.rest.Entities.Departments;
import com.MyHotel.rest.Service.IDepartments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeparmentsImp implements IDepartments {

    @Autowired
    private DepartmentsDao dao;

    @Override
    public List<Departments> getDepartments() {
        return dao.getDepartments();
    }

    @Override
    public Optional<Departments> getDepartmentById(int id) {
        return dao.getDepartmentById(id);
    }

    @Override
    public List<DepartmentSegmentSalaryDTO> getDepartmentsSalaryA() {
        return dao.departmentsCountBySalarySegmentA();
    }

    @Override
    public List<DepartmentSegmentSalaryDTO> getDepartmentsSalaryB() {
        return dao.departmentsCountBySalarySegmentB();
    }

    @Override
    public List<DepartmentSegmentSalaryDTO> getDepartmentsSalaryC() {
        return dao.departmentsCountBySalarySegmentC();
    }

    @Override
    public List<SalaryAVGperDepartMoreThan2EmployeesDTO> getSalaryDepartmentConditional() {
        return dao.getSalaryAVGByDepartment();
    }
}
