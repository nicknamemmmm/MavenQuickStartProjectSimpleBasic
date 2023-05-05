package com.soft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soft.beans.Employee;

public class App 
{
    

	public static void main( String[] args )
    {
ApplicationContext context = new ClassPathXmlApplicationContext("com/soft/cnfg/applicationContext.xml");
        
        System.out.println("Ioc container started.........!");
        
        Employee emp = context.getBean(Employee.class);
        
        System.out.println(emp);
}
}