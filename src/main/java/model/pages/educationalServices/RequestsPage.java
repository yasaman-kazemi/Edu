package model.pages.educationalServices;

import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.Date;

public class RequestsPage extends MainPage {

    public RequestsPage(User user) {
        super(user);
    }

    public RequestsPage(Date now, Date lastLogin, User user) {
        super(now, lastLogin, user);
    }
}
