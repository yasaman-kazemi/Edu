package model.pages.educationalServices;

import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.Date;

public class ExamListPage extends MainPage {

    public ExamListPage(User user, PageManager pageManager) {
        super(user, pageManager);
    }

    public ExamListPage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
    }
}
