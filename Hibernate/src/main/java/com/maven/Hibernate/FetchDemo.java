package com.maven.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    //get,load
    public static void main(String[] args) {

        System.out.println("program has started........");
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session s= factory.openSession();

        //get-studetn:103
        Address  s1=s.get(Address.class,1);
        System.out.println(s1);
        s.close();
        factory.close();
        System.out.println("program has closed........");
    }

}
