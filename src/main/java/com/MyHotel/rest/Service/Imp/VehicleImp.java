package com.MyHotel.rest.Service.Imp;

import com.MyHotel.rest.Daos.AutomobileDao;
import com.MyHotel.rest.Daos.TrucksDao;
import com.MyHotel.rest.Entities.Automobile;
import com.MyHotel.rest.Entities.Trucks;
import com.MyHotel.rest.Service.IVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleImp  implements IVehicle {


    @Autowired
    private TrucksDao trucksDao;

    @Autowired
    private AutomobileDao automobileDao;

    @Override
    public void addTruck(Trucks truck) {
        trucksDao.addTruck(truck);
    }

    @Override
    public void updateTruck(Trucks truck) {
        trucksDao.updateTruck(truck);
    }

    @Override
    public List<Trucks> listTrucks() {
        return trucksDao.listTrucks();
    }

    @Override
    public Trucks getTrucksById(int id) {
        return trucksDao.getTrucksById(id);
    }

    @Override
    public void removeTrucks(int id) {
        trucksDao.removeTrucks(id);
    }

    @Override
    public void addAutomobile(Automobile automobile) {
        automobileDao.addAutomobile(automobile);
    }

    @Override
    public void updateAutomobile(Automobile automobile) {
        automobileDao.updateAutomobile(automobile);
    }

    @Override
    public List<Automobile> listAutomobiles() {
        return automobileDao.listAutomobiles();
    }

    @Override
    public Automobile getAutomobileById(int id) {
        return automobileDao.getAutomobileById(id);
    }

    @Override
    public void removeAutomobile(int id) {
        automobileDao.removeAutomobile(id);
    }
}
