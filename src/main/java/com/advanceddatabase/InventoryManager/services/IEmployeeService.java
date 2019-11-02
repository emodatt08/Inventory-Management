package com.advanceddatabase.InventoryManager.services;
import java.util.List;

import com.advanceddatabase.InventoryManager.models.Employee;

public interface IEmployeeService {
	
	List<Employee> findAllEmployees();
	Employee getEmployeeById(int empId);
	void addEmployee(Employee employee);
	void updateEmployee(Employee employee, int empId);
	void deleteEmployee(int empId);
	
}
