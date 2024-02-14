package com.maven.SpringJdbc;

import com.maven.SpringJdbc.Dto.Student;
import com.maven.SpringJdbc.dao.StudentDao;
import com.maven.SpringJdbc.dao.StudentDaoImpl;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main{
    public static void main(String[] args) {
        System.out.println("My program has started.........");

        ApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);



        StudentDaoImpl studentDao=context.getBean("studentbean", StudentDaoImpl.class);

        Student student = new Student();
//        student.setId(121);
//        student.setName("Ishika");
//        student.setCity("Bokaro");
//
//        int result = studentDao.insert(student);
//        System.out.println(result);

        student.setId(132);
        student.setName("Vivek");
        student.setCity("Arrah");
//
        System.out.println(studentDao.Insert(student));
        //System.out.println(studentDao.Remove(134));









    }
}