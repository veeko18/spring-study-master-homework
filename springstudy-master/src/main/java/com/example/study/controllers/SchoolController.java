package com.example.study.controllers;

//Controller to handle school related requests

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //controller class handles requests coming from the client
@RequestMapping("/school") //used to map web requests onto specific handler classes/methods
public class SchoolController {

}
