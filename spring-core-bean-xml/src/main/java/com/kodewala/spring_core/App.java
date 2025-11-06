package com.kodewala.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ClassPathXmlApplicationContext applicationContext =new ClassPathXmlApplicationContext("Resources\\ApplicationContext.xml");
   Account account=  (Account) applicationContext.getBean("acc1");
   System.out.println(account.getAccountNumber());
   System.out.println(account.getType());
   System.out.println(account.getIfsc());
      
    }
}
