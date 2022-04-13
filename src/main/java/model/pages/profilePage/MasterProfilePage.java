package model.pages.profilePage;

import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.Date;

public class MasterProfilePage extends MainPage {

    public MasterProfilePage(User user, PageManager pageManager) {
        super(user, pageManager);
    }

    public MasterProfilePage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
    }
}

