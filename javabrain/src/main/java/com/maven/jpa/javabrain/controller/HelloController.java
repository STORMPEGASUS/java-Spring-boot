package com.maven.jpa.javabrain.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


     @RequestMapping(value = "/hello")
     public String sayHi(){
         return "hi";
     }
}
