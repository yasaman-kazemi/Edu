package model.pages.profilePage;

import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;
import model.person.student.Student;
import model.person.student.StudentDAO;

import java.util.Date;

public class StudentProfilePage extends MainPage {

    public StudentProfilePage(User user, PageManager pageManager) {
        super(user, pageManager);
    }

    public StudentProfilePage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
    }

    public void changeEmail(String newEmail) {
        user.setEmail(newEmail);
    }

    public void changePhoneNumber(String newPhoneNumber) {
        user.setPhoneNumber(newPhoneNumber);
    }
}
