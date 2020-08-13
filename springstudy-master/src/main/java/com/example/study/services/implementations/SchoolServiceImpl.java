package com.example.study.services.implementations;

import com.example.study.models.School;
import com.example.study.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolService schoolService;

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

    @Override
    public boolean isSchoolAdded(School school) {
        return false;
    }
}
