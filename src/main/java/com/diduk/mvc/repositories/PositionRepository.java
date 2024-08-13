package com.diduk.mvc.repositories;

import com.diduk.mvc.entity.Position;
import com.diduk.mvc.repositories.dao.PositionDAO;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PositionRepository implements PositionDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Position getPosition(int id) {
        Session session = sessionFactory.getCurrentSession();
        Position position = session.get(Position.class, id);
        return position;
    }

    @Override
    public List<Position> showAllPositions() {
        Session session = sessionFactory.getCurrentSession();
        List<Position> positions = session.createQuery(" select p from Position p ", Position.class).list();
        return positions;
    }



    @Override
    public void saveOrUpdateDepartment(Position position) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(position);
    }

    @Override
    public void deletePosition(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete  from Position p where p.id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
