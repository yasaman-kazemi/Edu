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

public class ExamListPage extends MainPage {
    private ArrayList<Assignment> examList;

    public ExamListPage(User user, PageManager pageManager) {
        super(user, pageManager);
        examList = new ArrayList<>();
        Collections.sort(examList);
        initial();
    }

    public ExamListPage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
        examList = new ArrayList<>();
        Collections.sort(examList);
        initial();
    }

    public void initial() {
        if (user instanceof Student) {
            for (Course course : ((Student) user).getCurrentCourses())
                examList.addAll(course.getExamList());
        }
        Collections.sort(examList);
    }

    public ArrayList<Assignment> getExamList() {
        Collections.sort(examList);
        return this.examList;
    }

    public void setExamList(ArrayList<Assignment> examList) {
        Collections.sort(examList);
        this.examList = examList;
    }


}
