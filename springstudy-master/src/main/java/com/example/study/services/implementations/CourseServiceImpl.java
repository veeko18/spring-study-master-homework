package com.example.study.services.implementations;

import com.example.study.models.Course;
import com.example.study.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseService courseService;

    @Override
    public void createCourse(Course course) {
        //what logic to put here?
    }

    @Override
    public Optional<Course> findCourseByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Course> displayListOfCourses(List<Course> courses) {
        return null;
    }

    @Override
    public boolean isCourseAdded(Course course) {
        return false;
    }
}
