package model.pages.profilePage;

import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.Date;

public class MasterProfilePage extends MainPage {

    public MasterProfilePage(User user) {
        super(user);
    }

    public MasterProfilePage(Date now, Date lastLogin, User user) {
        super(now, lastLogin, user);
    }
}

