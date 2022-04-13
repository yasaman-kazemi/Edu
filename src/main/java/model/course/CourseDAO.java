package model.course;

import utils.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseDAO implements Dao<Course> {
    private List<Course> courseList;
    private int counter = 1000;

    public CourseDAO(List<Course> courseList) {
        courseList = new ArrayList<>();
    }

    @Override
    public Optional<Course> get(String id) {
        for (Course course : courseList) {
            if (course.getId().equals(id)) return Optional.of(course);
        }
        return Optional.empty();
    }

    @Override
    public List<Course> getAll() {
        return courseList;
    }

    @Override
    public void save(Course course) {
        setId(course);
        courseList.add(course);
    }

    @Override
    public void delete(Course course) {
        courseList.remove(course);
    }

    @Override
    public void setId(Course course) {
        counter++;
        String id = course.getCourseCredit() + String.valueOf(counter).substring(1);
        course.setId(id);
    }
}
