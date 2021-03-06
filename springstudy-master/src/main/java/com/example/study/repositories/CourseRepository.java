package com.example.study.repositories;

import com.example.study.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Repository to handle course related queries
 *
 * @author Vinod John
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, UUID> {

    Optional<Course> findCourseByName(String name);

    Optional<Course> displayListOfCourses(List<Course> courses);
}
