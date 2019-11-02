package com.advanceddatabase.InventoryManager.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.advanceddatabase.InventoryManager.models.Employee;

import com.advanceddatabase.InventoryManager.services.EmployeeService;
import com.advanceddatabase.InventoryManager.services.IEmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	IEmployeeService serviceRef;
	
	@GetMapping({"/","/home"})
	public String getHomePage(Model model) {
		model.addAttribute("successMsg", "Products");
		
		return "homepage";
	}
	
	@RequestMapping("/addNewEmployee")
	public String addNewEmployeePage(Model model) {
		 Employee employee = new Employee();
		model.addAttribute("employee",employee);
		return "employees/addNewEmployee";
	}
	
	
	@RequestMapping("/addEmployeeDetails")
	public String addEmployeeDetails(@ModelAttribute("employee") Employee employee, BindingResult result, Model model){
		
		if(result.hasErrors()){
			return "employees/addNewEmployee";
		}
		else{
			serviceRef.addEmployee(employee);
			model.addAttribute("successMsg", "Data Inserted Successfully");
			return "employees/allEmployees";
			/*
			model.addAttribute("student", student);
			
			return "show";*/
		}
	}
	
	@RequestMapping("/getAllEmployee")
	public String getEmployeeList(Model model) {
		List<Employee> empList = new ArrayList<Employee>();
		empList= serviceRef.findAllEmployees();
		System.out.println("employee :: {} "+empList);
		model.addAttribute("employeeList",empList);
		return "employees/allEmployees";
	}
	
	@RequestMapping(value="/employee", method=RequestMethod.GET)
	public String Employee(Model model, @RequestParam("empId") int empId) {
		Employee emp  = serviceRef.getEmployeeById(empId);
		System.out.println("Before view "+emp);
		model.addAttribute("employeeData",emp);
		return "EmployeeOperation";
	}
	
	@RequestMapping("/updateEmployee")
	public String updateEmployee(Model model, @RequestParam("empId") int empId) {
		Employee emp = serviceRef.getEmployeeById(empId);
		System.out.println("in update Emp"+emp);
		model.addAttribute("employeeDetails", emp);
		return "updateEmployeePage";
	}
	
	@RequestMapping("/updateEmployeeDetails")
	public String updateEmployeeDetail(@ModelAttribute("employee") Employee employee, BindingResult result, Model model){
		
		if(result.hasErrors()){
			return "NewEmployee";
		}
		else{
			System.out.println(employee);
			serviceRef.updateEmployee(employee, employee.getEmployeeNo());
			model.addAttribute("successMsg", "Employee Updated Successfully");
			
			return "Homepage";
			/*
			model.addAttribute("student", student);
			
			return "show";*/
		}
	}
	
	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(Model model, @RequestParam("empId") int empId) {
		System.out.println("in delete Emp"+empId);
		serviceRef.deleteEmployee(empId);
		model.addAttribute("successMsg", "Employee Deleted Successfully");
		
		return "Homepage";
	}
}
