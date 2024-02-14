package com.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MappingDemo {
    public static void main(String[] args) {

        System.out.println("program has started........");
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session s= factory.openSession();
        Transaction tx=s.beginTransaction();


        //creating two object of emp and two objects of project

        Emp e1=new Emp();
        Emp e2=new Emp();


        Project p1=new Project();
        Project p2=new Project();


        e1.setEmpID(1);
        e1.setEmpName("Ram");

        e2.setEmpID(2);
        e2.setEmpName("vivek");



        p1.setPid(10);
        p1.setProjectName("Banking system");

        p2.setPid(20);
        p2.setProjectName("library system");



        List<Project> projects1=new ArrayList<Project>();
        List<Emp> employees1=new ArrayList<Emp>();



        projects1.add(p1);
        projects1.add(p2);


        employees1.add(e1);
        employees1.add(e2);

        e1.setProjects(projects1);
        p2.setEmployees(employees1);


        //saving the data into the session variables

        s.save(e1);
        s.save(e2);
        s.save(p1);
        s.save(p2);




        tx.commit();

        s.close();

        factory.close();
        System.out.println("program has closed........");
    }
}
