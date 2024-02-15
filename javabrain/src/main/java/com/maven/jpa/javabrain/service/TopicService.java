package com.maven.jpa.javabrain.service;



import com.maven.jpa.javabrain.Dao.Topic;
import com.maven.jpa.javabrain.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class TopicService {


        @Autowired
        private TopicRepository topicRepository;

//        private List<Topic> topics =new ArrayList<>(Arrays.asList(
//                new Topic("1" ,"SpringFramework","spring boot "),
//                new Topic("2" ,"Flutter ","App development"),
//                new Topic("3" ,"hibernate","Data jpa and some")
//       ));

        //updated code given from framework
        public List<Topic> getTopics(){
            //return topics;
            List<Topic> topics = new ArrayList<>();
            topicRepository.findAll().forEach(topics::add);
            return topics;
        }

        //updated code from the framework
        public Topic getTopic(String id) {
            //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
            return topicRepository.findById(id).get();
    }


        //updated code given from framework
        public void addTopic(Topic topic) {
           // topics.add(topic);
            topicRepository.save(topic);
    }

    //updated code from the framework
        public void updateTopic(Topic topic,String id) {
//            for(int i=0;i<topics.size();i++){
//                Topic t=topics.get(i);
//                if(t.getId().equals(id)){
//                    topics.set(i,topic);
//                    return;
//                }
//            }
            topicRepository.save(topic);
    }

       //updated code from the framework
        public void removeTopic(String id) {
           // topics.removeIf(t->t.getId().equals(id));
            topicRepository.deleteById(id);
    }
}
