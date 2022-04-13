package model.pages.educationalServices;

import model.course.Assignment;
import model.course.Course;
import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;
import model.person.student.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ExamListPage extends MainPage {
    private List<Assignment> examList;

    public ExamListPage(User user, PageManager pageManager) {
        super(user, pageManager);
        examList = new ArrayList<>();
        initial();
    }

    public ExamListPage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
        examList = new ArrayList<>();
        initial();
    }

    public void initial() {
        if (user instanceof Student) {
            for (Course course: ((Student) user).getCurrentCourses())
                examList.addAll(course.getExamList());
        }
    }

    public List<Assignment> getExamList() {
        Collections.sort(examList);
        return this.examList;
    }

    public void setExamList(List<Assignment> examList) {
        this.examList = examList;
    }

}
