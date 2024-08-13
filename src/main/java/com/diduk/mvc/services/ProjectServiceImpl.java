package com.diduk.mvc.services;

import com.diduk.mvc.entity.Position;
import com.diduk.mvc.entity.Project;
import com.diduk.mvc.repositories.dao.PositionDAO;
import com.diduk.mvc.repositories.dao.ProjectDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectDAO projectDAO;

    @Override
    @Transactional
    public Project getProject(int id) {
        return projectDAO.getProject(id);
    }

    @Override
    @Transactional
    public List<Project> showAllProjects() {
        return  projectDAO.showAllProjects();
    }


    @Override
    @Transactional
    public void saveOrUpdateProject(Project project) {
       projectDAO.saveOrUpdateProject(project);
    }

    @Override
    @Transactional
    public void deleteProject(int id) {
       projectDAO.deleteProject(id);
    }
}
