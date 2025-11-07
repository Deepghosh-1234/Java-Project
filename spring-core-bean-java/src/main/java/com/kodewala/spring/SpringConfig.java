package com.kodewala.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.bean.Order;
@Configuration
public class SpringConfig {

	@Bean("order")
		public Order createOrderBean()
		{
			Order order=new Order();
			order.setOrderId(12345);
			order.setItemName("iphone15");
			order.setSetStatus("pending");
			return order;
		}

	

}
