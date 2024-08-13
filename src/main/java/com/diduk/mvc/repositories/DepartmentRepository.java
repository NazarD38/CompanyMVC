package com.diduk.mvc.repositories;

import com.diduk.mvc.entity.Department;
import com.diduk.mvc.repositories.dao.DepartmentDAO;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.util.List;

@Repository
public class DepartmentRepository implements DepartmentDAO {
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public Department getDepartment(int id) {
        Session session = sessionFactory.getCurrentSession();
        Department department = session.get(Department.class, id);
        return department;
    }

    @Override
    public List<Department> getAllDepartments() {
        Session session = sessionFactory.getCurrentSession();
        List<Department> departments = session.createQuery("select d from Department d ", Department.class).list();
        return departments;
    }

    @Override
    public void saveOrUpdateDepartment(Department department) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(department);
    }


    @Override
    public void deleteDepartment(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete from Department d where d.id = :id");
        query.setParameter("id",id);
        query.executeUpdate();
    }

}
