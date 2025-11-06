package com.kodewala.spring_core3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Resources\\applicationContext.xml");
        Family family=  (Family) applicationContext.getBean("family1");
        System.out.println(family.getFatherName());
        System.out.println(family.getMotherName());
        System.out.println(family.getChildName());
    }
}
