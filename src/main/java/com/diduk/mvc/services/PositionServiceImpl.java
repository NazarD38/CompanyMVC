package com.diduk.mvc.services;

import com.diduk.mvc.entity.Position;
import com.diduk.mvc.repositories.dao.PositionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionDAO positionDAO;

    @Override
    @Transactional
    public Position getPosition(int id) {
        return positionDAO.getPosition(id);
    }

    @Override
    @Transactional
    public List<Position> showAllPositions() {
        return  positionDAO.showAllPositions();
    }


    @Override
    @Transactional
    public void saveOrUpdateDepartment(Position position) {
        positionDAO.saveOrUpdateDepartment(position);
    }

    @Override
    @Transactional
    public void deletePosition(int id) {
        positionDAO.deletePosition(id);
    }
}
