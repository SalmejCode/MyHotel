package com.MyHotel.rest.Daos;

import com.MyHotel.rest.Entities.Automobile;
import com.MyHotel.rest.Entities.Trucks;
import com.MyHotel.rest.jpa.TrucksJpaDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrucksDao extends AbstractDao<Trucks> implements TrucksJpaDao{



    private SessionFactory sessionFactory;

    @Override
    protected JpaRepository<Trucks, Integer> getRepository() {
        return null;
    }

    @Override
    public void addTruck(Trucks trucks) {

        try(  Session session = sessionFactory.openSession()){
            session.persist(trucks);
        }
    }

    @Override
    public void updateTruck(Trucks trucks) {

        try(  Session session = sessionFactory.openSession()){
            session.update(trucks);
        }
    }

    @Override
    public List<Trucks> listTrucks() {
        try(  Session session = sessionFactory.openSession()){
            List<Trucks> trucksList = session.createQuery("from Trucks").list();

            return trucksList;
        }
    }

    @Override
    public Trucks getTrucksById(int id) {
        try(  Session session = sessionFactory.openSession()){
            Trucks trucks = (Trucks) session.load(Trucks.class, new Integer(id));

            return trucks;
        }
    }

    @Override
    public void removeTrucks(int id) {

        try(  Session session = sessionFactory.openSession()){

            Trucks trucks = (Trucks) session.load(Trucks.class, new Integer(id));
            if(null != trucks){
                session.delete(trucks);
            }
        }
    }
}
