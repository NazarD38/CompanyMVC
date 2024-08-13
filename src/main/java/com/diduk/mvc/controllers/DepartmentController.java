package com.diduk.mvc.controllers;

import com.diduk.mvc.entity.Department;
import com.diduk.mvc.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller()
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @RequestMapping("/showAllDepartments")
    public String showAllDepartments(
            Model model
    ) {
        List<Department> departments = departmentService.getAllDepartments();
        model.addAttribute("AllDepartments", departments);
        return "all-departments";
    }

    @RequestMapping("/updateInfo")
    public String updateDepartment(@RequestParam("depId") int id, Model model) {
        Department department = departmentService.getDepartment(id);
        model.addAttribute("department", department);
        return "department-info";
    }

    @RequestMapping("/deleteDepartment")
    public String deleteDepartment(@RequestParam("depId") int id) {
        departmentService.deleteDepartment(id);
        return "redirect:/departments/showAllDepartments";
    }

    @RequestMapping("/saveDepartment")
    public String saveDepartment(Department department) {
        departmentService.saveDepartment(department);
        return "redirect:/departments/showAllDepartments";
    }

    @RequestMapping("/addNewDepartment")
    public String addNewDepartment(Model model) {
        Department department = new Department();
        model.addAttribute("department", department);
        return "department-info";
    }

}
