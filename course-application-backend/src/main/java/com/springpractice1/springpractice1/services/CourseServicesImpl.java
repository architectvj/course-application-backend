package com.springpractice1.springpractice1.services;

import com.springpractice1.springpractice1.dao.CourseDAO;
import com.springpractice1.springpractice1.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServicesImpl implements CourseService {
//    List<Course> list;
    @Autowired
    private CourseDAO courseDAO;

    public CourseServicesImpl() {
//        list = new ArrayList<>();
//        list.add(new Course(1,"DS","This is a DS course"));
//        list.add(new Course(2,"Algo","This is a algo course"));
//        list.add(new Course(3, "Mock","This is a mock course"));
    }

    @Override
    public List<Course> getCourses() {
        //return list;
        return courseDAO.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
//        Course course = null;
//        for (Course findCourse: list
//             ) {
//            if(findCourse.getId() == courseId){
//                course = findCourse;
//                break;
//
//            }
//
//        }
//        return course;
        return courseDAO.getById(courseId);
    }

    @Override
    public Course addCourse(Course newCourse) {
//        list.add(newCourse);
//        return newCourse;
        courseDAO.save(newCourse);
        return newCourse;
    }

    @Override
    public Course updateCourse(Course course) {
//        list.forEach(e -> {
//            if(e.getId() == course.getId()){
//                e.setDescription(course.getDescription());
//                e.setTitle(course.getTitle());
//            }
//        });
//        return course;
        courseDAO.save(course);
        return course;
    }

    @Override
    public Course deleteCourse(long courseId) {
//        Course deleteCourse = null;
//        for (Course findCourse: list
//             ) {
//            if(findCourse.getId()== courseId){
//                deleteCourse = findCourse;
//                list.remove(deleteCourse);
//                break;
//            }
//        }

//        return deleteCourse;
        Course entity = courseDAO.getById(courseId);
        courseDAO.delete(entity);
        return entity;

    }
}
