package com.example.study.controllers;

//Controller to handle course related requests

import com.example.study.models.Course;
import com.example.study.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//Controller class handles requests coming from the client
@Controller
//used to map web requests onto specific handler classes/methods
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public String showCoursePage(@ModelAttribute("course") Course course,
                                 @ModelAttribute("message") String message,
                                 @ModelAttribute("messageType") String messageType) {
        return "course/courseMenu";

        //add new courses

        /*public String addCourse () {
            boolean isAdded = courseService.isCourseAdded(course);

            if(isAdded){

                return "redirect:/";
            } else {
                return "redirect:/course";
            }
        }

        //display all courses
        public String displayAllCourses(String course){
            return "";
        }*/
    }
}
