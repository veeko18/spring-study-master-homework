package com.example.study.services.implementations;

import com.example.study.models.School;
import com.example.study.services.SchoolService;

import java.util.List;
import java.util.Optional;

public class SchoolServiceImpl implements SchoolService {
    @Override
    public void createSchool(School school) {

    }

    @Override
    public Optional<School> findSchoolByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<School> displayListOfSchools(List<School> schools) {
        return null;
    }
}
