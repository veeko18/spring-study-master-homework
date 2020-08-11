package com.example.study.components;

import com.example.study.models.Course;
import com.example.study.models.School;
import com.example.study.models.User;
import com.example.study.services.CourseService;
import com.example.study.services.SchoolService;
import com.example.study.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.UUID;

/**
 * Data Init component
 *
 * @author Vinod John
 */
@Component
public class DataInit {
    @Autowired
    private UserService userService;
    @Autowired
    private SchoolService schoolService;
    @Autowired
    private CourseService courseService;

    @PostConstruct
    public void initData() {
        initUserData();
        initSchoolData();
        initCourse();
    }

        // PRIVATE METHODS //
        private void initUserData () {
            User user = new User();
            user.setUsername("veeko2018@gmail.com");
            user.setPassword("Password123@");

            if (userService.findUserByUsername(user.getUsername()).isEmpty()) {
                userService.createUser(user);
            }
        }

        private void initSchoolData () {
            School school = new School();
            school.setName("Software Development Academy");
            school.setCity("Tallinn");
            school.setPhone("+555-000-111");

            if (schoolService.findSchoolByName(school.getName()).isEmpty()) {
                schoolService.createSchool(school);
            }
        }

    private void initCourse() {

        Course course = new Course();
        course.setId(1);
        course.setName("Java");
        course.setDurationMonths(8);

        if (courseService.findCourseByName(course.getName()).isEmpty()) {
            courseService.createCourse(course);
        }
    }