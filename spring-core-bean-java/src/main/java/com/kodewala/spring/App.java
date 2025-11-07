package com.kodewala.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.bean.Order;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
 ApplicationContext context  = new AnnotationConfigApplicationContext(SpringConfig.class);
 Order order= (Order) context.getBean("order");
 System.out.println(order.getItemName() +" | "+order.getOrderId()+ " | "+ order.getSetStatus());
// System.out.println(order.getOrderId());
// System.out.println(order.getSetStatus());
    }
}
