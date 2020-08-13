package com.example.study.controllers;

//Controller to handle school related requests

import com.example.study.models.School;
import com.example.study.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//controller class handles requests coming from the client
@Controller
//used to map web requests onto specific handler classes/methods
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping
    public String showCoursePage(@ModelAttribute("school") School school,
                                 @ModelAttribute("message") String message,
                                 @ModelAttribute("messageType") String messageType) {
        return "school/schoolMenu";

        //add new schools

        /*public String addSchool () {
            boolean isAdded = SchoolService.isSchoolAdded(school);

            if (isAdded) {

                return "redirect:/";
            } else {
                return "redirect:/school";
            }
        }

        //display all schools
        public String displayAllSchools (String school) {
            return "";
        }*/
    }
}
