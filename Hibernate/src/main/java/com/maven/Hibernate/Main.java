package com.maven.Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("My program has started.........");





        //used for connection(thread safe)
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        //creating student object

        Student st = new Student();
        st.setId(103);
        st.setName("Vartik jain");
        st.setCity("Munger");
        System.out.println(st);


        //creating object of address class

        Address ad= new Address();
        ad.setStreet("street1");
        ad.setCity("Ranchi");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(101);



        //for getting current session
        Session s= factory.openSession();

        //for initializing transaction
        Transaction tx=s.beginTransaction();

        //for update the class to table

        s.save(st);
        s.save(ad);
        //commiting the transaction
        tx.commit();

        s.close();
        factory.close();
        System.out.println("done........");

    }


}