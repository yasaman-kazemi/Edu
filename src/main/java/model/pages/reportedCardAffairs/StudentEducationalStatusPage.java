package model.pages.reportedCardAffairs;

import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.Date;

public class StudentEducationalStatusPage extends MainPage {

    public StudentEducationalStatusPage(User user, PageManager pageManager) {
        super(user, pageManager);
    }

    public StudentEducationalStatusPage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
    }
}

