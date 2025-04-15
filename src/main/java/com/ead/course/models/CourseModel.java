package com.ead.course.models;

import com.ead.course.enums.CourseLevel;
import com.ead.course.enums.CourseStatus;

import java.time.LocalDateTime;
import java.util.Set;

public class CourseModel {
    private Integer courseId;
    private String courseName;
    private String courseDescription;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdateDate;
    private CourseStatus courseStatus;
    private CourseLevel courseLevel;
    private Integer instructorId;
    private String imageUrl;
    private Set<ModuleModel> modules;
}
