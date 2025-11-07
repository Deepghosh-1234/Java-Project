package com.kodewala.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrderItem {
	@Value("100")
  private  int orderId;

  public int getOrderId() {
	return orderId;
  }

  public void setOrderId(int orderId) {
	this.orderId = orderId;
  }

  }
