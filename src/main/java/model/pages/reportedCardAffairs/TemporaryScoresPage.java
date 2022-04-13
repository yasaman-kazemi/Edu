package model.pages.reportedCardAffairs;

import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.Date;

public class TemporaryScoresPage extends MainPage {

    public TemporaryScoresPage(User user) {
        super(user);
    }

    public TemporaryScoresPage(Date now, Date lastLogin, User user) {
        super(now, lastLogin, user);
    }
}
