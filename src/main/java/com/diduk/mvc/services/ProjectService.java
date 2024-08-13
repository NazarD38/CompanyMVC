package com.diduk.mvc.services;

import com.diduk.mvc.entity.Project;

import java.util.List;

public interface ProjectService {
    public Project getProject(int id);

    public List<Project> showAllProjects();

    public void saveOrUpdateProject(Project project);

    public void deleteProject(int id);
}
