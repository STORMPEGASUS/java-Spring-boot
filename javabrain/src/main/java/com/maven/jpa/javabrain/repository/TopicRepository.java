package com.maven.jpa.javabrain.repository;

import com.maven.jpa.javabrain.Dao.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {


    //get All()
    //get Topics(String id)
    //post Topics()
    //update Topic(String id)
    //delete Topic(String id)
    //i dont have to write any code framework will do it for me


}
