package com.MyHotel.rest.Daos;


import com.MyHotel.rest.Dto.EmployeeInfoDTO;
import com.MyHotel.rest.Dto.EmployeesCountrySalaryDetailDTO;
import com.MyHotel.rest.Dto.NumberPerSegmentDTO;
import com.MyHotel.rest.Entities.Employees;
import com.MyHotel.rest.jpa.EmployeesJpaDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeesDao extends AbstractDao<Employees>{

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private EmployeesJpaDao employeesDao;


    @Override
    protected JpaRepository<Employees, Integer> getRepository() {
        return employeesDao;
    }

    public List<Employees> getEmployees() {return employeesDao.findAll(); }

    public Optional<Employees> getEmployeesById(int id){return employeesDao.findById(id);}

    public NumberPerSegmentDTO  employeesCountBySalarySegmentA(){

        NumberPerSegmentDTO numberPerSegmentDTO = new NumberPerSegmentDTO(employeesDao.findEmployeesBySalarySegmentA().size());

         return numberPerSegmentDTO;
    }

    public NumberPerSegmentDTO  employeesCountBySalarySegmentB(){

        NumberPerSegmentDTO numberPerSegmentDTO = new NumberPerSegmentDTO(employeesDao.findEmployeesBySalarySegmentB().size());

        return numberPerSegmentDTO;
    }

    public NumberPerSegmentDTO  employeesCountBySalarySegmentC(){

        NumberPerSegmentDTO numberPerSegmentDTO = new NumberPerSegmentDTO(employeesDao.findEmployeesBySalarySegmentC().size());

        return numberPerSegmentDTO;
    }

    public List<EmployeeInfoDTO> getEmployeesInfoMaxSalaryDepartment(){

        try(  Session session = sessionFactory.openSession()){
            Query query = session.createNativeQuery("select e.First_name, e.Last_name, e.email " +
                    "from Employees e  " +
                    "inner join Departments d ON  e.departments_id = d.id " +
                    "inner join (select Max(e.salary) as MaxSalary, d.id " +
                    "from Employees e "+
                    "inner join Departments d ON  e.departments_id = d.id "+
                    "Group by(d.name)) as  ed ON ed.MaxSalary = e.salary and d.id = ed.id");

            return query.getResultList();

        }
    }

    public List<Employees> getTenuredEmployees(){
        try(  Session session = sessionFactory.openSession()){
            Query query = session.createNativeQuery("select e.* " +
                    "from employees e " +
                    "where e.hire_date < '2013-01-20'");

            return query.getResultList();

        }
    }

    public List<EmployeesCountrySalaryDetailDTO> getEmployeeCountrySalaryTenureCondition() {

        try(  Session session = sessionFactory.openSession()){
            Query query = session.createNativeQuery("select count(c.id) as employeesPerCountry, c.country_name, avg(e.salary) as averagePerCountry, Max(e.salary), Min(e.salary) " +
                    "from employees e  " +
                    "inner join departments d ON  e.departments_id = d.id " +
                    "inner join locations l on  d.locations_id = l.id " +
                    "inner join countries c on   c.id = l.countries_id " +
                    "group by(c.id)");

            return query.getResultList();

        }
    }
}
