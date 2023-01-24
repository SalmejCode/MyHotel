package com.MyHotel.rest.jpa;

import com.MyHotel.rest.Entities.Employees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeesJpaDao extends JpaRepository<Employees, Integer> {

    @Override
    List<Employees> findAll();

    Optional<Employees> findById(int id);

    @Query("select e  from Employees e where e.salary <3500")
    List<Employees> findEmployeesBySalarySegmentA();

    @Query("select e from Employees e where e.salary >=3500 AND e.salary < 8000")
    List<Employees> findEmployeesBySalarySegmentB();

    @Query("select e from Employees e where e.salary >=8000")
    List<Employees> findEmployeesBySalarySegmentC();


}
