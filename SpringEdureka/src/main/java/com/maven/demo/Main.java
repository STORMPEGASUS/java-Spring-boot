package com.maven.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


//         Employee employee = new Employee();
//         employee.setEid(101);
//         employee.setName("John Smith");
//         employee.setSalary("100000");
//
//         System.out.println(employee);

        //inversion of control
        ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");

        Employee e1=context.getBean("emp1",Employee.class);
//        Employee e2=context.getBean("emp2",Employee.class);

        System.out.println("----------------Spring ioc----------------");

        System.out.println(e1);
//        System.out.println(e2);

        ClassPathXmlApplicationContext ctx= (ClassPathXmlApplicationContext) context;
        ctx.close();

    }
}