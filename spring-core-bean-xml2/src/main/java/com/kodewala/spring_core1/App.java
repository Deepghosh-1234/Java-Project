package com.kodewala.spring_core1;

import org.springframework.beans.factory.wiring.ClassNameBeanWiringInfoResolver;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Resources1\\StudentInfo.xml");
     Student student=(Student) applicationContext.getBean("student1");
     System.out.println(student.getName());
     System.out.println(student.getRollNo());
     System.out.println(student.getSection());
     
    }
}
