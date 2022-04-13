package model.pages.educationalServices;

import model.course.Assignment;
import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ExamListPage extends MainPage {
    List<Assignment> examList;

    public ExamListPage(User user, PageManager pageManager) {
        super(user, pageManager);
        examList = new ArrayList<>();
    }

    public ExamListPage(Date now, User user, PageManager pageManager, List<Assignment> examList) {
        super(now, user, pageManager);
        this.examList = examList;
    }

    public void sortExam(List<Assignment> examList) {
        Collections.sort(examList);
    }
}
