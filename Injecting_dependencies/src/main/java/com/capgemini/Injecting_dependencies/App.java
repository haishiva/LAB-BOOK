package com.capgemini.Injecting_dependencies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext content=new ClassPathXmlApplicationContext("bean.xml");
        Employee emp1=(Employee)content.getBean("Employeebean");
        SBU sbu=(SBU)content.getBean("SBUbean");
        System.out.println(emp1.toString());
        
        System.out.println(sbu.toString1());
        System.out.println(sbu.toString());
       
      // System.out.println(emp1.getDetails().getSbuHead());
        System.out.println("enter employee id to get details:");
       int s;
      Scanner sc=new Scanner(System.in);
       s=sc.nextInt();
       System.out.println(sbu.emp.get(s-1));
    }
}
