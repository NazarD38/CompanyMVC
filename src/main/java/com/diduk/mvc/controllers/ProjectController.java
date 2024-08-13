package com.diduk.mvc.controllers;


import com.diduk.mvc.entity.Project;
import com.diduk.mvc.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping("/showAllProjects")
    public String showAllProjects(Model model) {
        List<Project> projects = projectService.showAllProjects();
        model.addAttribute("allProjects", projects);
        return "all-projects";
    }

    @RequestMapping("/updateProject")
    public String updateProject(@RequestParam("projectId") int id, Model model) {
        var project = projectService.getProject(id);
        model.addAttribute("project", project);
        return "project-info";
    }

    @RequestMapping("/saveProject")
    public String saveProject(Project project){
        projectService.saveOrUpdateProject(project);
        return "redirect:/projects/showAllProjects";
    }

    @RequestMapping("/addNewProject")
    public String addNewProject(Model model){
        Project project = new Project();
        model.addAttribute("project", project);
        return "project-info";
    }

    @RequestMapping("/deleteProject")
    public String deleteProject(@RequestParam("projectId") int id, Model model) {
        projectService.deleteProject(id);
        return "redirect:/projects/showAllProjects";
    }

}
