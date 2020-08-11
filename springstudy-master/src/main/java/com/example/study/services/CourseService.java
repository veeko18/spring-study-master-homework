package com.example.study.services;

import com.example.study.models.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface CourseService {

    //create a new course
    void createCourse(Course course);

    //find course by name
    Optional<Course> findCourseByName(String name);

    //display list of courses
    List<Course> displayListOfCourses(List<Course> courses);

}


