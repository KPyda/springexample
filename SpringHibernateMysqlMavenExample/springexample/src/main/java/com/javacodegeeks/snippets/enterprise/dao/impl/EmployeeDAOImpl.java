package com.javacodegeeks.snippets.enterprise.dao.impl;

import com.javacodegeeks.snippets.enterprise.dao.repository.EmployeeDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javacodegeeks.snippets.enterprise.model.Employee;

@Repository("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

    @Override
    public void persist(Employee T) {
        sessionFactory.getCurrentSession().persist(T);
    }

    @Override
    public Employee findById(int id) {
        return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    @Override
    public void update(Employee T) {
        sessionFactory.getCurrentSession().update(T);
    }

    @Override
    public void delete(Employee T) {
        sessionFactory.getCurrentSession().delete(T);
    }
}