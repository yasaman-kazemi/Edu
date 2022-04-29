package model.pages;

import model.pages.mainPage.MainPage;
import model.person.User;
import model.samester.Semester;
import utils.ImageLoader;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class LoginPage extends MainPage {
    private HashMap<String, String> captcha;

    public LoginPage(PageManager pageManager) {
        super(null, pageManager);
        captcha = new HashMap<>();
        captcha.put("captcha1", "5947");
        captcha.put("captcha2", "8393");
        captcha.put("captcha3", "8425");
        captcha.put("captcha4", "9075");
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
    public boolean isCaptchaRight(String inputCaptcha, String icon) {
        return captcha.get(icon).equals(inputCaptcha);
    }


}
