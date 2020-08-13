package com.example.study.services;

import com.example.study.models.School;
import java.util.List;
import java.util.Optional;

public interface SchoolService {

    //create new schools
    void createSchool(School school);

    //find school by name
    Optional<School> findSchoolByName(String name);

    //display list of schools
    List<School> displayListOfSchools(List<School> schools);

    boolean isSchoolAdded(School school);

}
