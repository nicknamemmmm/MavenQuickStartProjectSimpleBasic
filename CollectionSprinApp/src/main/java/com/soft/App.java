package com.soft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soft.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
       
        ApplicationContext context = new ClassPathXmlApplicationContext("com/soft/cnfg/applicationContext.xml");
        System.out.println("IOC container started.....");
        
        Student student=(Student) context.getBean("person");
        
        System.out.println(student);
       
    }
}
