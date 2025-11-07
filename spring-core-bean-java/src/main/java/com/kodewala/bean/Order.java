package com.kodewala.bean;

import org.springframework.context.annotation.Configuration;


public class Order {
    private int orderId;
    private String itemName;
    private String setStatus;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getSetStatus() {
		return setStatus;
	}
	public void setSetStatus(String setStatus) {
		this.setStatus = setStatus;
	}
}
