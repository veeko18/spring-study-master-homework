package com.example.study.repositories;

import com.example.study.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Repository to handle school related queries
 */
@Repository
public interface SchoolRepository extends JpaRepository<Course, UUID> {
}