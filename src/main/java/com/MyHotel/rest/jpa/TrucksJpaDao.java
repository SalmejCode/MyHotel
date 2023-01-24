package com.MyHotel.rest.jpa;


import com.MyHotel.rest.Entities.Trucks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrucksJpaDao  {

    public void addTruck(Trucks p);
    public void updateTruck(Trucks p);
    public List<Trucks> listTrucks();
    public Trucks getTrucksById(int id);
    public void removeTrucks(int id);
}
