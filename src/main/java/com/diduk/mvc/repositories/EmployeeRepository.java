package com.diduk.mvc.repositories;

import com.diduk.mvc.entity.Employee;
import com.diduk.mvc.entity.Position;
import com.diduk.mvc.repositories.dao.EmployeeDAO;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public class EmployeeRepository implements EmployeeDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Employee getEmployeeById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class, id);
    }

    @Override
    public List<Employee> showAllEmployees() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> employees = session.createQuery("select emp from Employee emp", Employee.class).list();
        return employees;
    }

    @Override
    public void saveOrUpdate(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete from Employee where id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }


}
