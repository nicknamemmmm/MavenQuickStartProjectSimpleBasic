package com.soft;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.soft.beans.WelcomeMassage;

public class App 
{
    public static void main( String[] args )
    {
    
     Resource resource = new ClassPathResource("com/soft/cnfg/applicationContext.xml");
     
     BeanFactory factory = new XmlBeanFactory(resource);
     System.out.println("IOC container start.......!");
     
     WelcomeMassage message = (WelcomeMassage) factory.getBean("wcmsg");
     
     System.out.println(message.showMassage());
    }
}
