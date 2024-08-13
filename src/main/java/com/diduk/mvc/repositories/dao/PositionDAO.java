package com.diduk.mvc.repositories.dao;

import com.diduk.mvc.entity.Department;
import com.diduk.mvc.entity.Position;

import java.util.List;

public interface PositionDAO {

    public Position getPosition(int id);

    public List<Position> showAllPositions();

    public void saveOrUpdateDepartment(Position position);

    public void deletePosition(int id);

}
