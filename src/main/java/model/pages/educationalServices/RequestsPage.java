package model.pages.educationalServices;

import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.Date;

public class RequestsPage extends MainPage {

    public RequestsPage(User user, PageManager pageManager) {
        super(user, pageManager);
    }

    public RequestsPage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
    }


}
