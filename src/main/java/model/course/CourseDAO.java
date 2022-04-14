package model.course;

import utils.Dao;

import java.util.ArrayList;
import java.util.Optional;

public class CourseDAO implements Dao<Course> {
    private ArrayList<Course> courseList;
    private int counter = 1000;

    public CourseDAO(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public CourseDAO() {
        this.courseList = new ArrayList<>();
    }

    @Override
    public Optional<Course> get(String id) {
        for (Course course : courseList) {
            if (course.getId().equals(id))
                return Optional.of(course);
        }
        return Optional.empty();
    }

    @Override
    public ArrayList<Course> getAll() {
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
