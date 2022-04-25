package Graphic;


public class GraphicPageManager {
    private MainFrame mainFrame;

    public GraphicPageManager() {
        mainFrame = MainFrame.getInstance();
    }

    public void enterToMainPage() {
        mainFrame.setMainPanel();
    }

    public void logout() {

    }

    public void enterToChangingPasswordPage() {

    }
}
