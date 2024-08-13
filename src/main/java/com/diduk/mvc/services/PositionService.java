package com.diduk.mvc.services;

import com.diduk.mvc.entity.Position;

import java.util.List;

public interface PositionService {

    public Position getPosition(int id);

    public List<Position> showAllPositions();

    public void saveOrUpdateDepartment(Position position);

    public void deletePosition(int id);

}
