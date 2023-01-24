package com.MyHotel.rest.Daos;

import com.MyHotel.rest.Entities.Automobile;
import com.MyHotel.rest.jpa.AutomobileJpaDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AutomobileDao extends AbstractDao<Automobile> implements AutomobileJpaDao {


    private SessionFactory sessionFactory;

    @Override
    protected JpaRepository<Automobile, Integer> getRepository() {
        return null;
    }

    @Override
    public void addAutomobile(Automobile automobile) {

        try(  Session session = sessionFactory.openSession()){
            session.persist(automobile);
        }
    }

    @Override
    public void updateAutomobile(Automobile automobile) {

        try(  Session session = sessionFactory.openSession()){
            session.update(automobile);
        }
    }

    @Override
    public List<Automobile> listAutomobiles() {
        try(  Session session = sessionFactory.openSession()){
            List<Automobile> automobilesList = session.createQuery("from Atomobile").list();

            return automobilesList;
        }
    }

    @Override
    public Automobile getAutomobileById(int id) {
        try(  Session session = sessionFactory.openSession()){
            Automobile automobile = (Automobile) session.load(Automobile.class, new Integer(id));

            return automobile;
        }
    }

    @Override
    public void removeAutomobile(int id) {
        try(  Session session = sessionFactory.openSession()){
            Automobile automobile = (Automobile) session.load(Automobile.class, new Integer(id));

            if(null != automobile){
                session.delete(automobile);
            }
        }

    }
}
