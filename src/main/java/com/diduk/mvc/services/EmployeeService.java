package com.diduk.mvc.services;

import com.diduk.mvc.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee getEmployeeById(int id);

    public List<Employee> showAllEmployees();

    public void saveOrUpdate(Employee employee);

    public void deleteEmployee(int id);
}
