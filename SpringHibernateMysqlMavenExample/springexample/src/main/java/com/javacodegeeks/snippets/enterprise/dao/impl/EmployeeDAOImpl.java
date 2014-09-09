package com.javacodegeeks.snippets.enterprise.dao.impl;

import com.javacodegeeks.snippets.enterprise.dao.repository.EmployeeDAO;
import com.javacodegeeks.snippets.enterprise.model.Employee;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class EmployeeDAOImpl extends HibernateDaoSupport implements EmployeeDAO {

    private HibernateTemplate template = null;

    @Override
    public void persist(Employee T) {
        template.persist(T);
    }

    @Override
    public Employee findById(int id) {
        return (Employee) template.get(Employee.class, id);

    }

    @Override
    public void update(Employee T) {
        template.update(T);
    }

    @Override
    public void delete(Employee T) {
        template.delete(T);
    }
}