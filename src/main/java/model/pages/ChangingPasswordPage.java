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

    public void changePassword(String oldPass, String newPass) {
        if (user.getPassword().equals(oldPass)) {
            user.setPassword(newPass);
        } else {
            //TODO return exception that old pass is incorrect
        }
    }
}
