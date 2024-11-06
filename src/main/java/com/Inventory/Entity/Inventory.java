package com.Inventory.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long inventoryId;
	private long productId;
	private double quanity;
	
	
	
	public Inventory() {
		super();
	}
	
	public Inventory(long inventoryId, long productId, double quanity) {
		super();
		this.inventoryId = inventoryId;
		this.productId = productId;
		this.quanity = quanity;
	}
	public long getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(long inventoryId) {
		this.inventoryId = inventoryId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public double getQuanity() {
		return quanity;
	}
	public void setQuanity(double quanity) {
		this.quanity = quanity;
	}

	@Override
	public String toString() {
		return "Inventory [inventoryId=" + inventoryId + ", productId=" + productId + ", quanity=" + quanity + "]";
	}
	
	
	
}
