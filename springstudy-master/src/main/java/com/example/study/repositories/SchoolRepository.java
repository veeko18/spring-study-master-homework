package com.example.study.repositories;

import com.example.study.models.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Repository to handle school related queries
 */
@Repository
public interface SchoolRepository extends JpaRepository<School, UUID> {

    Optional<School> findSchoolByName(String name);

    Optional<School> displayListOfSchools(List<School> schools);

}