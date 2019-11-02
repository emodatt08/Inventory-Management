package com.advanceddatabase.InventoryManager.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class Products {
	
	@Id
	@Column(name = "productNo")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "hibernate_sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "hibernate_sequence")
	private int productNo;
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	public String getReorderLevel() {
		return reorderLevel;
	}
	public void setReorderLevel(String reorderLevel) {
		this.reorderLevel = reorderLevel;
	}
	public int getReorderQuantity() {
		return reorderQuantity;
	}
	public void setReorderQuantity(int reorderQuantity) {
		this.reorderQuantity = reorderQuantity;
	}
	public LocalDate getReorderLeadTime() {
		return reorderLeadTime;
	}
	public void setReorderLeadTime(LocalDate reorderLeadTime) {
		this.reorderLeadTime = reorderLeadTime;
	}
	public String getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}
	private String productName;
	private String serialNo;
	private int unitPrice;
	private int quantityOnHand;
	private String reorderLevel;
	private int reorderQuantity;
	private LocalDate reorderLeadTime;
	private String categoryNo;
	
	public Products(int productNo, String productName, String serialNo, int unitPrice, int quantityOnHand,
			String reorderLevel, int reorderQuantity, LocalDate reorderLeadTime, String categoryNo) {
		super();
		this.productNo = productNo;
		this.productName = productName;
		this.serialNo = serialNo;
		this.unitPrice = unitPrice;
		this.quantityOnHand = quantityOnHand;
		this.reorderLevel = reorderLevel;
		this.reorderQuantity = reorderQuantity;
		this.reorderLeadTime = reorderLeadTime;
		this.categoryNo = categoryNo;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Products [productNo=" + productNo + ", productName=" + productName + ", serialNo=" + serialNo
				+ ", unitPrice=" + unitPrice + ", quantityOnHand=" + quantityOnHand + ", reorderLevel=" + reorderLevel
				+ ", reorderQuantity=" + reorderQuantity + ", reorderLeadTime=" + reorderLeadTime + ", categoryNo="
				+ categoryNo + "]";
	}
	
	
}
