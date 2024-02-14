package com.maven.SpringCore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
    public static void main(String[] args) {

     ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");

     student s1=context.getBean("student1", student.class);

        System.out.println(s1);
    }
}