package model.pages;


import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.Date;

public class ChangingPasswordPage extends MainPage {

    public ChangingPasswordPage(User user) {
        super(user);
    }

    public ChangingPasswordPage(Date now, Date lastLogin, User user) {
        super(now, lastLogin, user);
    }
}
