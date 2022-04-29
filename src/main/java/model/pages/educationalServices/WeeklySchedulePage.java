package model.pages.educationalServices;

import model.course.Course;
import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;
import model.person.student.Student;

import java.util.ArrayList;
import java.util.Date;

public class WeeklySchedulePage extends MainPage {
    private ArrayList<Course> courseList;

    public WeeklySchedulePage(User user, PageManager pageManager) {
        super(user, pageManager);
        courseList = new ArrayList<>();
        initial();
    }

    public WeeklySchedulePage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
        courseList = new ArrayList<>();
        initial();
    }

    private void initial() {
        if (user instanceof Student) {
            courseList.addAll(((Student) user).getCurrentCourses());
        }
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
}
