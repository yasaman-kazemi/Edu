package model.pages.profilePage;

import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.Date;

public class StudentProfilePage extends MainPage {

    public StudentProfilePage(User user) {
        super(user);
    }

    public StudentProfilePage(Date now, Date lastLogin, User user) {
        super(now, lastLogin, user);
    }
}
