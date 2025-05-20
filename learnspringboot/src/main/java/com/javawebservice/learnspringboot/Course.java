package com.javawebservice.learnspringboot;

public class Course {
    private  int id;
    private String courseName;
    private String authorName;

    public Course(int id, String courseName, String authorName) {
        this.id = id;
        this.courseName = courseName;
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getCourseName() {
        return courseName;
    }
}
