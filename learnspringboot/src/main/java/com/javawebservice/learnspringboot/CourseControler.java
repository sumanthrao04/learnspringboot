package com.javawebservice.learnspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseControler {

    @Value("${custom.message:Default message}")
    private String message;

    @RequestMapping("/getCourses")
    public List<Course> retriveCourses(){

        return Arrays.asList(
        new Course(1,"Learn Java","Sumanth Academy"),
        new Course(2,"Learn Springboot","Sumanth Academy"),
        new Course(3,"Learn Devops","Devops Academy"),
        new Course(4,"Learn Azure","Azure  Academy"),
       new Course(5,"Learn gcp","Sumanth Academy"),
        new Course(6,"Learn Kubernetes ","Kubernetes Academy")
        );
    }

    @GetMapping("message")
    public String getProfile(){
        return message;
    }

}
