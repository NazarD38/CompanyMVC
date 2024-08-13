package com.diduk.mvc.services;

import com.diduk.mvc.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department getDepartment(int id);

    public List<Department> getAllDepartments();

    public void saveDepartment(Department department);

    public void deleteDepartment(int id);


}
