package model.pages;

import model.person.User;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class LoginPage {
    private PageManager pageManager;
    private ArrayList<User> userList;
    private HashMap<Image,String> captcha;

    public LoginPage(PageManager pageManager, ArrayList<User> userList) {
        this.pageManager = pageManager;
        this.userList = userList;
    }

    public void login(String username, String password) {
        User user = getUser(username);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                pageManager.enterToMainPage();
            } else {

            }
        } else {

        }
    }

    private User getUser(String username) {
        for (User user : userList)
            if (user.getUsername().equals(username))
                return user;
        return null;
    }

    //todo fill this method
    private Boolean isCaptchaRight(String inputCaptcha){
        for (Image captchaImage: captcha.keySet()) {

        }
        return false;
    }


}
