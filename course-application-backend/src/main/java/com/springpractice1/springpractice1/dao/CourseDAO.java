package com.springpractice1.springpractice1.dao;

import com.springpractice1.springpractice1.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDAO extends JpaRepository<Course, Long> {

}
