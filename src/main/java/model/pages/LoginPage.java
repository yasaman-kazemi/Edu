package model.pages;

import model.pages.mainPage.MainPage;
import model.person.User;
import model.person.master.MasterDAO;
import model.person.student.StudentDAO;
import model.samester.Semester;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class LoginPage extends MainPage {
    private HashMap<Image, String> captcha;

    public LoginPage(PageManager pageManager) {
        super(null, pageManager);
    }

    //todo response not found.
    public boolean login(String username, String password) {
        Semester semester = pageManager.getSemester();
        ArrayList<User> users = new ArrayList<>(semester.getStudents());
        users.addAll(semester.getMasters());
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(password)) {
                    System.out.println("2");
                    pageManager.enterToMainPage(user);
                    return true;
                } else {

                }
                return false;
            }
        }
        return false;
    }

    //todo fill this method
    private boolean isCaptchaRight(String inputCaptcha) {
        for (Image captchaImage : captcha.keySet()) {

        }
        return false;
    }


}
