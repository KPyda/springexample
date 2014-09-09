package com.javacodegeeks.snippets.enterprise.service;

import com.javacodegeeks.snippets.enterprise.dao.repository.AddressDAO;
import com.javacodegeeks.snippets.enterprise.dao.repository.EmployeeDAO;
import com.javacodegeeks.snippets.enterprise.model.Address;
import com.javacodegeeks.snippets.enterprise.model.Employee;


public class EmployeeServiceImpl implements EmployeeService{

    public EmployeeServiceImpl(EmployeeDAO employeeDAO, AddressDAO addressDAO) {
        this.employeeDAO = employeeDAO;
        this.addressDAO = addressDAO;
    }

    public EmployeeServiceImpl(){}

    EmployeeDAO employeeDAO;
    AddressDAO addressDAO;

    public AddressDAO getAddressDAO() {
        return addressDAO;
    }

    public void setAddressDAO(AddressDAO addressDAO) {
        this.addressDAO = addressDAO;
    }

    public void persistAddress(Address address) {
        addressDAO.persist(address);
    }

    public void deleteAddress(Address address) {
        addressDAO.delete(address);
    }


    public EmployeeDAO getEmployeeDAO() {
        return employeeDAO;
    }

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

	public void persistEmployee(Employee employee) {
		employeeDAO.persist(employee);
	}

	public void updateEmployee(Employee employee) {
		employeeDAO.update(employee);
		
	}

	public Employee findEmployeeById(int id) {
		return employeeDAO.findById(id);
	}

	public void deleteEmployee(Employee employee) {
		employeeDAO.delete(employee);
	}
}
