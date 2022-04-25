package model.pages;

import model.person.User;
import model.person.master.MasterDAO;
import model.person.student.StudentDAO;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class LoginPage {
    private PageManager pageManager;
    private HashMap<Image, String> captcha;

    public LoginPage(PageManager pageManager, ArrayList<User> userList) {
        this.pageManager = pageManager;
    }

    //todo response not found.
    public void login(String username, String password) {
        StudentDAO studentDAO = (StudentDAO) pageManager.getSemester().getDao("student");
        MasterDAO masterDAO = (MasterDAO) pageManager.getSemester().getDao("master");
        ArrayList<User> users = new ArrayList<>(studentDAO.getAll());
        users.addAll(masterDAO.getAll());
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(password)) {
                    pageManager.enterToMainPage();
                } else {

                }
                return;
            }
        }
    }

    //todo fill this method
    private Boolean isCaptchaRight(String inputCaptcha) {
        for (Image captchaImage : captcha.keySet()) {

        }
        return false;
    }


}
