package model.pages.reportedCardAffairs;

import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.Date;

public class StudentEducationalStatus extends MainPage {

    public StudentEducationalStatus(User user) {
        super(user);
    }

    public StudentEducationalStatus(Date now, Date lastLogin, User user) {
        super(now, lastLogin, user);
    }
}

