package com.example.demo.service;


import com.example.demo.Dao.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class TopicService {

        private List<Topic> topics =new ArrayList<>(Arrays.asList(
                new Topic("1" ,"SpringFramework","spring boot "),
                new Topic("2" ,"Flutter ","App development"),
                new Topic("3" ,"hibernate","Data jpa and some")
       ));


        public List<Topic> getTopics(){
            return topics;
        }

    public Topic getTopic(String id) {
            return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
            topics.add(topic);
    }

    public void updateTopic(Topic topic,String id) {
            for(int i=0;i<topics.size();i++){
                Topic t=topics.get(i);
                if(t.getId().equals(id)){
                    topics.set(i,topic);
                    return;
                }
            }
    }

    public void removeTopic(String id) {
            topics.removeIf(t->t.getId().equals(id));
    }
}
