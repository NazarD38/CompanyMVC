package com.diduk.mvc.services;

import com.diduk.mvc.entity.Employee;
import com.diduk.mvc.repositories.dao.EmployeeDAO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Override
    @Transactional
    public List<Employee> showAllEmployees() {
        return employeeDAO.showAllEmployees();
    }

    @Override
    @Transactional
    public void saveOrUpdate(Employee employee) {
        employeeDAO.saveOrUpdate(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
}
