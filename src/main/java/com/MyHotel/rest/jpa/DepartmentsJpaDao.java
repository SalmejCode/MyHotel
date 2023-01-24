package com.MyHotel.rest.jpa;

import com.MyHotel.rest.Dto.DepartmentSegmentSalaryDTO;
import com.MyHotel.rest.Entities.Departments;
import com.MyHotel.rest.Entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DepartmentsJpaDao extends JpaRepository<Departments, Integer> {

    @Override
    List<Departments> findAll();

    Optional<Departments> findById(int id);

}
