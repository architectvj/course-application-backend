package com.springpractice1.springpractice1.services;

import com.springpractice1.springpractice1.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course  addCourse(Course newCourse);

    public Course updateCourse(Course course);

    public Course deleteCourse(long courseId);
}
