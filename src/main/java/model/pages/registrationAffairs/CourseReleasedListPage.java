package model.pages.registrationAffairs;

import model.Department;
import model.course.Course;
import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;
import model.person.master.Master;
import model.person.master.MasterPosition;
import model.person.student.Grade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseReleasedListPage extends MainPage implements Searchable<Course> {
    private List<Course> courseList;
    //filters
    private Department department;
    private Grade grade;
    private String courseId;

    public CourseReleasedListPage(User user, PageManager pageManager, List<Course> courseList) {
        super(user, pageManager);
        this.courseList = courseList;
    }

    public CourseReleasedListPage(Date now, User user, PageManager pageManager,
                                  List<Course> courseList, Department department, Grade grade, String courseId) {
        super(now, user, pageManager);
        this.courseList = courseList;
        this.department = department;
        this.grade = grade;
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

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public List<Course> search() {
        ArrayList<Course> suitableCourses = new ArrayList<>();
        for (Course course : courseList)
            if ((department == null || course.getDepartment().equals(department)) &&
                    (grade == null || course.getGrade().equals(grade)) &&
                    (courseId == null || course.getId().equals(courseId))) {
                suitableCourses.add(course);
            }
        return suitableCourses;
    }

    public void deleteCourse(Course course) {
        if (user instanceof Master)
            if (((Master) user).getMasterPosition() == MasterPosition.Manager)
                pageManager.getSemester().deleteCourse(course);
    }

    public void addCourseByAssistant(String name, Department department,
                          List<Course> prerequisitesCourse, List<Course> corequisitesCourse,
                          Master master, int courseCredit,
                          List<Date> weeklyClassDate, Grade grade) {
        if (user instanceof Master)
            if (((Master) user).getMasterPosition() == MasterPosition.Assistant) {
                pageManager.getSemester().saveCourse(name, department, prerequisitesCourse, corequisitesCourse, master,
                        courseCredit, weeklyClassDate, grade);
            }
    }

}
