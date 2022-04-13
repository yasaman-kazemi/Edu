package model.pages.educationalServices;

import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.Date;

public class WeeklySchedulePage extends MainPage {

    public WeeklySchedulePage(User user) {
        super(user);
    }

    public WeeklySchedulePage(Date now, Date lastLogin, User user) {
        super(now, lastLogin, user);
    }
}
