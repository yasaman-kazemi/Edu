package model.course;

import model.person.master.Master;
import utils.Dao;

import java.util.ArrayList;
import java.util.List;
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

    public Optional<Course> getByName(String courseName) {
        for (Course course : courseList) {
           if (course.getName().equals(courseName))
               return Optional.of(course);
        }
        return Optional.empty();
    }

    public List<Course> getByMaster(Master master) {
        List<Course> result = new ArrayList<>();
        for (Course course : courseList) {
            if (course.getMaster().equals(master))
                result.add(course);
        }
        return result;
    }
}
