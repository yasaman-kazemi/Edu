package model.pages;


import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.Date;

public class ChangingPasswordPage extends MainPage {

    public ChangingPasswordPage(User user, PageManager pageManager) {
        super(user, pageManager);
    }

    public ChangingPasswordPage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
    }

    public void setNewPassword(String newPassword) {
        user.setPassword(newPassword);
    }
}
