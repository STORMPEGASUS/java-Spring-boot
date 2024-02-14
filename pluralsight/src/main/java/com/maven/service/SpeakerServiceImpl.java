package com.maven.service;

import com.maven.model.Speaker;
import com.maven.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImpl implements SpeakerService {
//    private SpeakerRepository speakerRepository = new SpeakerRepositoryImpl();
      private SpeakerRepository speakerRepository;


    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    public SpeakerServiceImpl() {
        System.out.println("Hello i am default constructor");
    }

//    //constructor injection method
    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("Hello i am constructor injection method");
        this.speakerRepository = speakerRepository;
    }

    //created for setter injection
//    @Autowired
//    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
//        System.out.println("Hello i am setter injection method");
//        this.speakerRepository = speakerRepository;
//    }
}
