package com.MyHotel.rest.Service;

import com.MyHotel.rest.Entities.Automobile;
import com.MyHotel.rest.Entities.Trucks;

import java.util.List;

public interface IVehicle {

    public void addTruck(Trucks p);
    public void updateTruck(Trucks p);
    public List<Trucks> listTrucks();
    public Trucks getTrucksById(int id);
    public void removeTrucks(int id);

    public void addAutomobile(Automobile p);
    public void updateAutomobile(Automobile p);
    public List<Automobile> listAutomobiles();
    public Automobile getAutomobileById(int id);
    public void removeAutomobile(int id);
}
