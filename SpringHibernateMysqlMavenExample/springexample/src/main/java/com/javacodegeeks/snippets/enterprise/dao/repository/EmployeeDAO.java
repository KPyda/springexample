package com.javacodegeeks.snippets.enterprise.dao.repository;

import com.javacodegeeks.snippets.enterprise.dao.main.DAO;
import com.javacodegeeks.snippets.enterprise.model.Employee;

public interface EmployeeDAO extends DAO<Employee> {

    public void persist(Employee T);

    public Employee findById(int id);

    public void update(Employee T);

    public void delete(Employee T);
		  
}
