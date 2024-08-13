package com.diduk.mvc.controllers;

import com.diduk.mvc.entity.Department;
import com.diduk.mvc.entity.Employee;
import com.diduk.mvc.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/showAllEmployees")
    public String showAllEmployees(Model model) {
        List<Employee> employees = employeeService.showAllEmployees();
        model.addAttribute("allEmployees", employees);
        return "all-employees";
    }

    @RequestMapping("/updateEmployee")
    public String updateEmployee(@RequestParam("empId")int id, Model model) {
        Employee employee=employeeService.getEmployeeById(id);
        model.addAttribute("employee",employee);
        return "employee-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(Employee employee) {
        employeeService.saveOrUpdate(employee);
        return "redirect:/employees/showAllEmployees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewDepartment(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id) {
        employeeService.deleteEmployee(id);
        return "redirect:/employees/showAllEmployees";
    }



}
