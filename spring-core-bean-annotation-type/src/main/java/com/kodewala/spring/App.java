package com.kodewala.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.spring.bean.OrderItem;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        OrderItem orderitem=context.getBean(OrderItem.class);
        System.out.println(orderitem.getOrderId());
    }
}
