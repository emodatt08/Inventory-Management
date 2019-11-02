package com.advanceddatabase.InventoryManager.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.advanceddatabase.InventoryManager.models.Employee;


public interface IEmployeeDAO extends JpaRepository<Employee, Integer> {

}
