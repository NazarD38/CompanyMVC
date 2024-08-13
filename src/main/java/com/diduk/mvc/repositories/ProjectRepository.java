package com.diduk.mvc.repositories;

import com.diduk.mvc.entity.Project;
import com.diduk.mvc.repositories.dao.ProjectDAO;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectRepository implements ProjectDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Project getProject(int id) {
        Session session = sessionFactory.getCurrentSession();
        Project project = session.get(Project.class, id);
        return project;
    }

    @Override
    public List<Project> showAllProjects() {
        Session session = sessionFactory.getCurrentSession();
        List<Project> projects = session.createQuery("select p from  Project p", Project.class).getResultList();
        return projects;
    }

    @Override
    public void saveOrUpdateProject(Project project) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(project);
    }

    @Override
    public void deleteProject(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query =session.createQuery("delete from Project p  where p.id=:id ", Project.class);
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
