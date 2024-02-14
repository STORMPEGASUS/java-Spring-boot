package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Mapdemo {
    public static void main(String[] args) {
        System.out.println("program has started........");
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        //creating questions
        Question q1 = new Question();
        q1.setQuestionId(123);
        q1.setQuestion("What is Java");

        Answer answer1= new Answer();
        answer1.setAnswerId(12);
        answer1.setAnswer("Java is a programming language");
        answer1.setQuestion(q1);

        Answer answer2= new Answer();
        answer2.setAnswerId(13);
        answer2.setAnswer("Java is used for backend");
        answer2.setQuestion(q1);


        Answer answer3= new Answer();
        answer3.setAnswerId(14);
        answer3.setAnswer("Java consist of collections");
        answer3.setQuestion(q1);

        List<Answer> answers=new ArrayList<Answer>();
        answers.add(answer1);
        answers.add(answer2);
        answers.add(answer3);
        q1.setAnswers(answers);

//        Answer answer = new Answer();
//        answer.setAnswerId(343);
//        answer.setAnswer("java is  programming language");
//        q1.setAnswer(answer);

//        Question q2 = new Question();
//        q2.setQuestionId(242);
//        q2.setQuestion("What is collection framework");
//
//        Answer answer2 = new Answer();
//        answer2.setAnswerId(344);
//        answer2.setAnswer("API to work with objects in java");
//        q2.setAnswer(answer2);



        Session s= factory.openSession();
        Transaction tx=s.beginTransaction();

         s.persist(q1);
         s.persist(answer1);
         s.persist(answer2);
         s.persist(answer3);

//        s.persist(q1);
//        s.persist(answer);
//        s.persist(q2);
//        s.persist(answer2);

        tx.commit();



       //fetching answer
        Question question=(Question) s.get(Question.class,123);
        System.out.println(question.getQuestion());

        for(Answer answer : question.getAnswers()){
            System.out.println(answer.getAnswer());
        }
//        System.out.println(question.getQuestion());
//        System.out.println(question.getAnswer().getAnswer());


        s.close();

        factory.close();
        System.out.println("program has closed........");
    }
}
