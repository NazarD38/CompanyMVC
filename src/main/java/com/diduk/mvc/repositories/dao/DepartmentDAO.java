package com.diduk.mvc.repositories.dao;

import com.diduk.mvc.entity.Department;
import org.springframework.ui.Model;

import java.util.List;

public interface DepartmentDAO {

    public Department getDepartment(int id);

    public List<Department> getAllDepartments();

    public void saveOrUpdateDepartment(Department department);

    public void deleteDepartment(int id);


}
