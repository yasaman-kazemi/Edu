package model.pages.reportedCardAffairs;

import model.course.Course;
import model.course.Score;
import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;
import model.person.student.Student;

import java.util.Date;

public class TemporaryScoresPage extends MainPage {

    public TemporaryScoresPage(User user, PageManager pageManager) {
        super(user, pageManager);
    }

    public TemporaryScoresPage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
    }

    public void setProtest(String protest) {
        if (user instanceof Student) {
        }
    }
}
