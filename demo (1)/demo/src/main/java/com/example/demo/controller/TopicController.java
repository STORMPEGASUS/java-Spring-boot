package com.example.demo.controller;


import com.example.demo.Dao.Topic;
import com.example.demo.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping(value = "/topics")
    public List<Topic> getAllTopics( ){
        return topicService.getTopics();
    }

    @GetMapping(value = "/topics/{id}")
    public Topic getTopic(@PathVariable("id") String id){
        return topicService.getTopic(id);
    }

    @PostMapping(value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @PutMapping(value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable("id") String id){
        topicService.updateTopic(topic,id);
    }


    @DeleteMapping(value = "/topics/{id}")
    public void removeTopic(@PathVariable("id") String id){
        topicService.removeTopic(id);
    }


}
