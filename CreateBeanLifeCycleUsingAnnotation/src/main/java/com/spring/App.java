package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
       Student s1=(Student) context.getBean("s1");
       System.out.println(s1);
       ((AbstractApplicationContext) context).close();
    }
}
