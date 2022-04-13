package model.pages.educationalServices;

import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.Date;

public class WeeklySchedulePage extends MainPage {

    public WeeklySchedulePage(User user, PageManager pageManager) {
        super(user, pageManager);
    }

    public WeeklySchedulePage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
    }
}
