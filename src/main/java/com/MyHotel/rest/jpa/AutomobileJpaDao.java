package com.MyHotel.rest.jpa;

import com.MyHotel.rest.Entities.Automobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AutomobileJpaDao  {

    public void addAutomobile(Automobile p);
    public void updateAutomobile(Automobile p);
    public List<Automobile> listAutomobiles();
    public Automobile getAutomobileById(int id);
    public void removeAutomobile(int id);
}
