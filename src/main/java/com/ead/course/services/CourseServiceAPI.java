package com.ead.course.services;

import com.ead.course.dtos.CourseRecordDto;
import com.ead.course.models.CourseModel;

import java.util.List;
import java.util.Optional;

public interface CourseServiceAPI {

    void delete(CourseModel courseModel);

    CourseModel save(CourseRecordDto courseRecordDto);

    boolean existsByName(String name);

    List<CourseModel> getAllCourses();

    Optional<CourseModel> findById(Integer courseId);

    CourseModel update(CourseRecordDto courseRecordDto, CourseModel courseModel);

}
