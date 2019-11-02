package com.advanceddatabase.InventoryManager.services;

import java.util.List;

import com.advanceddatabase.InventoryManager.models.Employee;
import com.advanceddatabase.InventoryManager.models.Products;

public interface IProductService {
	List<Products> findAllProducts();
	Employee getProductById(int productNo);
	void addProduct(Employee employee);
	void updateProduct(Products product, int productNo);
	void deleteProduct(int productNo);
}

