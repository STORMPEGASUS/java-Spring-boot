package com.maven.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embed_demo {
    public static void main(String[] args) {
        System.out.println("program has started........");
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

         Student student = new Student();
         student.setId(112);
         student.setName("Mayank");
         student.setCity("Noida");


        CertificateStud certificate = new CertificateStud();
        certificate.setCourseName("M.tech");
        certificate.setDuration("2 months");
        student.setCerti(certificate);

        Session s= factory.openSession();

        Transaction tx=s.beginTransaction();

        //objects to be saved
        s.save(student);


        tx.commit();
        s.close();

        factory.close();
        System.out.println("program has closed........");
    }
}
