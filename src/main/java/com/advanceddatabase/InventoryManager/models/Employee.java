package com.advanceddatabase.InventoryManager.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.time.LocalDate;


@Entity
@Table(name="EMPLOYEE")
//@SequenceGenerator(name="seqGen",sequenceName="MSC01.emp_seq")
public class Employee {
	@Id
	@Column(name = "employeeno")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "hibernate_sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "hibernate_sequence")
	private int employeeNo;
	@Column(name = "EMPLOYEENAME")
 	private String employeeName;
	@Column(name = "EMPEMAIL")
    private String empEmail;
	@Column(name = "EMPNO")
    private String empNo;
	@Column(name = "EMPHIREDATE")
    private LocalDate emphireDate;
	@Column(name = "SALARY")
    private String salary;
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeno(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public LocalDate getEmphireDate() {
		return emphireDate;
	}
	public void setEmphireDate(LocalDate emphireDate) {
		this.emphireDate = emphireDate;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeno=" + employeeNo + ", employeeName=" + employeeName + ", empEmail=" + empEmail
				+ ", empNo=" + empNo + ", emphireDate=" + emphireDate + ", salary=" + salary + "]";
	}
	public Employee() {
		super();
	}
	public Employee(int employeeNo, String employeeName, String empEmail, String empNo, LocalDate emphireDate,
			String salary) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.empEmail = empEmail;
		this.empNo = empNo;
		this.emphireDate = emphireDate;
		this.salary = salary;
	}
	
	
	
	

}
