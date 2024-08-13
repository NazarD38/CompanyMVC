package com.diduk.mvc.repositories.dao;

import com.diduk.mvc.entity.Employee;
import com.diduk.mvc.entity.Position;

import java.util.List;

public interface EmployeeDAO {

    public Employee getEmployeeById(int id);

    public List<Employee> showAllEmployees();

    public void saveOrUpdate(Employee employee);

    public void deleteEmployee(int id);

}
