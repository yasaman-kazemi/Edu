package model.pages;

import model.person.User;

public class LoginPage {
    protected PageManager pageManager;

    public void login(User user, String password) {
        if (user.getPassword().equals(password)) pageManager.enterToMainPage();
    }



}
