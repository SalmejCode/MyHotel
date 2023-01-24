package com.MyHotel.rest.Daos;

import com.MyHotel.rest.Dto.DepartmentSegmentSalaryDTO;
import com.MyHotel.rest.Dto.SalaryAVGperDepartMoreThan2EmployeesDTO;
import com.MyHotel.rest.Entities.Departments;
import com.MyHotel.rest.jpa.DepartmentsJpaDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentsDao extends AbstractDao<Departments>{

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private DepartmentsJpaDao departmentsDao;
    @Override
    protected JpaRepository<Departments, Integer> getRepository() {
        return departmentsDao;
    }

    public List<Departments> getDepartments() {return departmentsDao.findAll(); }

    public Optional<Departments> getDepartmentById(int id){return departmentsDao.findById(id);}

    public List<DepartmentSegmentSalaryDTO>   departmentsCountBySalarySegmentA(){

        try(  Session session = sessionFactory.openSession()){
            Query query = session.createNativeQuery("select count(e.id), d.name " +
                    "from Employees e  " +
                            "inner join Departments d ON e.departments_id = d.id " +
                            "where e.salary <3500 " +
                            "Group by(d.name)");

            return query.getResultList();

        }
    }

    public List<DepartmentSegmentSalaryDTO>   departmentsCountBySalarySegmentB(){

        try(  Session session = sessionFactory.openSession()){
            Query query = session.createNativeQuery("select count(e.id), d.name " +
                    "from Employees e  " +
                    "inner join Departments d ON e.departments_id = d.id " +
                    "where e.salary >=3500 and e.salary < 8000 " +
                    "Group by(d.name)");

            return query.getResultList();

        }
    }

    public List<DepartmentSegmentSalaryDTO>   departmentsCountBySalarySegmentC(){

        try(  Session session = sessionFactory.openSession()){
            Query query = session.createNativeQuery("select count(e.id), d.name " +
                    "from Employees e  " +
                    "inner join Departments d ON e.departments_id = d.id " +
                    "where e.salary>=8000 " +
                    "Group by(d.name)");

            return query.getResultList();

        }
    }

    public List<SalaryAVGperDepartMoreThan2EmployeesDTO> getSalaryAVGByDepartment(){

        try(  Session session = sessionFactory.openSession()){
            Query query = session.createNativeQuery("select count(e.id) , d.id, d.name , avg(e.salary)  " +
                    "from employees e  " +
                    "inner join departments d ON  e.departments_id = d.id " +
                    "group by (d.id) " +
                    "having count(e.id) > 2");

            return query.getResultList();

        }
    }
}
