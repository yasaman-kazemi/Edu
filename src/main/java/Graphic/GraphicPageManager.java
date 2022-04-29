package Graphic;


import Graphic.pages.LoginPage;
import Graphic.pages.MyPanel;
import model.person.User;

public class GraphicPageManager {

    public void logout(LoginPage loginPage) {

    }

    public void changePage(User user, MyPanel myPanel) {
        MainFrame mainFrame = MainFrame.getInstance(user, myPanel);
        mainFrame.setVisible(true);
    }
}
