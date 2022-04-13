package model.pages;

import model.person.User;

import java.util.List;

public class LoginPage {
    private PageManager pageManager;
    private List<User> userList;

    public LoginPage(PageManager pageManager, List<User> userList) {
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
