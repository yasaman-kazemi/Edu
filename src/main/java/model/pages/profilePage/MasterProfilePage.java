package model.pages.profilePage;

import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;
import model.person.master.Master;
import model.person.master.MasterDAO;
import model.person.student.Student;
import model.person.student.StudentDAO;

import java.util.Date;

public class MasterProfilePage extends MainPage {

    public MasterProfilePage(User user, PageManager pageManager) {
        super(user, pageManager);
    }

    public MasterProfilePage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
    }

    public void changeEmail(String newEmail) {
        user.setEmail(newEmail);
    }

    public void changePhoneNumber(String newPhoneNumber) {
        user.setPhoneNumber(newPhoneNumber);
    }
}

