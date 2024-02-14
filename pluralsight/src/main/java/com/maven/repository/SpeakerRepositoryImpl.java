package com.maven.repository;

import com.maven.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository("speakerRepository")
public class SpeakerRepositoryImpl implements SpeakerRepository {

       public Speaker speaker;


       @Autowired
       public SpeakerRepositoryImpl(Speaker speaker) {
              this.speaker = speaker;
       }

       @Override
       public List<Speaker> findAll() {

              List<Speaker> speakers =new ArrayList<Speaker>();



//              speaker.setFirstname("John");
              speaker.setLastname("Kate");

              speakers.add(speaker);

              return speakers;
       }





}
