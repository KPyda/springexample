package com.javacodegeeks.snippets.enterprise.service;

import com.javacodegeeks.snippets.enterprise.dao.repository.AddressDAO;
import com.javacodegeeks.snippets.enterprise.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacodegeeks.snippets.enterprise.dao.repository.EmployeeDAO;
import com.javacodegeeks.snippets.enterprise.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDAO employeeDAO;

    @Autowired
    AddressDAO addressDAO;

    public AddressDAO getAddressDAO() {
        return addressDAO;
    }

    public void setAddressDAO(AddressDAO addressDAO) {
        this.addressDAO = addressDAO;
    }

    @Transactional
    @Override
    public void persistAddress(Address address) {
        addressDAO.persist(address);
    }

    @Transactional
    @Override
    public void deleteAddress(Address address) {
        addressDAO.delete(address);
    }


    public EmployeeDAO getEmployeeDAO() {
        return employeeDAO;
    }

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
	
	@Override
	@Transactional
	public void persistEmployee(Employee employee) {
		employeeDAO.persist(employee);
		
	}

	@Override
	@Transactional
	public void updateEmployee(Employee employee) {
		employeeDAO.update(employee);
		
	}
	@Override
	@Transactional
	public Employee findEmployeeById(int id) {
		return employeeDAO.findById(id);
	}

	@Override
	@Transactional
	public void deleteEmployee(Employee employee) {
		employeeDAO.delete(employee);
		
	}
}
