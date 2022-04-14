package model.pages;

import model.person.User;

import java.util.ArrayList;

public class LoginPage {
    private PageManager pageManager;
    private ArrayList<User> userList;

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


}
