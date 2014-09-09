package com.javacodegeeks.snippets.enterprise.service;

import com.javacodegeeks.snippets.enterprise.model.Address;
import com.javacodegeeks.snippets.enterprise.model.Employee;

public interface EmployeeService {

	void persistEmployee(Employee employee);

	Employee findEmployeeById(int id);

	void updateEmployee(Employee employee);

	void deleteEmployee(Employee employee);

    void persistAddress(Address address);

    void deleteAddress(Address address);
}
