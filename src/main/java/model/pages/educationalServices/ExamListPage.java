package model.pages.educationalServices;

import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.Date;

public class ExamListPage extends MainPage {

    public ExamListPage(User user) {
        super(user);
    }

    public ExamListPage(Date now, Date lastLogin, User user) {
        super(now, lastLogin, user);
    }
}
