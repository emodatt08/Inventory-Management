package com.advanceddatabase.InventoryManager.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;

import com.advanceddatabase.InventoryManager.dao.IEmployeeDAO;
import com.advanceddatabase.InventoryManager.models.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmployeeService implements IEmployeeService{
	LocalDate myObj = LocalDate.now();
	List<Employee> empList =new ArrayList<>(Arrays.asList(
			new Employee(1,"Rohan","rohan@gmail.com","0241763214",myObj, "300"),
			new Employee(2,"James","james@gmail.com","0541734214",myObj, "400")
			));
	
	@Autowired
	private IEmployeeDAO daoRef;
	
	@Override
	public Employee getEmployeeById(int empId) {
		//return empList.stream().filter(e -> e.getEmpId() == empId).findFirst().get();
		return daoRef.getOne(empId);
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		//empList.add(employee);
		daoRef.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee, int empId) {
		/*for(int i=0; i<empList.size(); i++) {
			Employee e = empList.get(i);
			if(e.getEmpId()==empId) {
				empList.set(i, employee);
				return;
			}
		}*/
		daoRef.save(employee);
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		//empList.removeIf(e -> e.getEmpId() == empId);
		daoRef.deleteById(empId);
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return daoRef.findAll();
	}

}
