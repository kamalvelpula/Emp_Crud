package com.kamal.dao;

import com.kamal.model.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public void save(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }

    @Transactional
    @Override
    public void update(Employee employee) {
        sessionFactory.getCurrentSession().update(employee);
    }

    @Transactional
    @Override
    public void delete(int id) {
        Employee employee = sessionFactory.getCurrentSession().get(Employee.class, id);
        if (employee != null) {
            sessionFactory.getCurrentSession().delete(employee);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public Employee getById(int id) {
        return sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Employee> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from Employee", Employee.class).list();
    }
}
