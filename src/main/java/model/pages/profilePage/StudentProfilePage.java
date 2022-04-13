package model.pages.profilePage;

import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.Date;

public class StudentProfilePage extends MainPage {

    public StudentProfilePage(User user, PageManager pageManager) {
        super(user,pageManager);
    }

    public StudentProfilePage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
    }
}
