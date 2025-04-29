package com.ead.course.controllers;

import com.ead.course.models.CourseModel;
import com.ead.course.services.CourseServiceAPI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    final CourseServiceAPI courseService;

    public CourseController(CourseServiceAPI courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<List<CourseModel>> getAllCourses() {
        List<CourseModel> courses = courseService.getAllCourses();
        return ResponseEntity.ok(courses);
    }
}
