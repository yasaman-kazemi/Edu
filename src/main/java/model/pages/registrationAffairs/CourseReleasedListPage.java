package model.pages.registrationAffairs;

import model.Department;
import model.course.Course;
import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;
import model.person.master.Master;
import model.person.master.MasterPosition;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseReleasedListPage extends MainPage implements Searchable<Course> {
    private List<Course> courseList;
    private Department department;
    private Master master;
    private String courseId;

    //todo check constructors
    public CourseReleasedListPage(User user, List<Course> courseList) {
        super(user);
        this.courseList = courseList;
    }

    public CourseReleasedListPage(Date now, Date lastLogin, User user, PageManager pageManager,
                                  List<Course> courseList, Department department, Master master, String courseId) {
        super(now, lastLogin, user, pageManager);
        this.courseList = courseList;
        this.department = department;
        this.master = master;
        this.courseId = courseId;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public List<Course> search() {
        List<Course> suitableCourses = new ArrayList<>();
        for (Course course : courseList)
            if (course.getDepartment().equals(department) &&
                    course.getMaster().equals(master) &&
                    course.getId().equals(courseId)) suitableCourses.add(course);
        return suitableCourses;
    }

    public void delete(Course course) {
        if (user instanceof Master)
            if (((Master) user).getMasterPosition() == MasterPosition.Manager) courseList.remove(course);
    }

    public void add(Course course) {
        if (user instanceof Master)
            if (((Master) user).getMasterPosition() == MasterPosition.Manager) courseList.add(course);
    }

    //todo fill method
    public void update() {

    }

}
