package com.diduk.mvc.services;

import com.diduk.mvc.entity.Department;
import com.diduk.mvc.repositories.dao.DepartmentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDAO departmentDAO;


    @Override
    @Transactional
    public Department getDepartment(int id) {
        return departmentDAO.getDepartment(id);
    }

    @Override
    @Transactional
    public List<Department> getAllDepartments() {
        return departmentDAO.getAllDepartments();
    }

    @Override
    @Transactional
    public void saveDepartment(Department department) {
        departmentDAO.saveOrUpdateDepartment(department);
    }


    @Override
    @Transactional
    public void deleteDepartment(int id) {
        departmentDAO.deleteDepartment(id);
    }

}
