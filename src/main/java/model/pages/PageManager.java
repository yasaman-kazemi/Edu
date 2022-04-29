package model.pages;


import Graphic.GraphicPageManager;
import Graphic.pages.CourseListPage;
import Graphic.pages.MastersListPage;
import model.pages.mainPage.MainPage;
import model.person.User;
import model.samester.Semester;

public class PageManager {
    private Semester semester;
    private GraphicPageManager graphicPageManager;

    public PageManager(Semester semester) {
        this.semester = semester;
        graphicPageManager = new GraphicPageManager();
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public GraphicPageManager getGraphicPageManager() {
        return graphicPageManager;
    }

    public void setGraphicPageManager(GraphicPageManager graphicPageManager) {
        this.graphicPageManager = graphicPageManager;
    }

    public void enterToMainPage(User user) {
        MainPage mainPage = new MainPage(user, this);
        Graphic.pages.mainPage.MainPage mainPageGr = new Graphic.pages.mainPage.MainPage(mainPage);
        graphicPageManager.changePage(user, mainPageGr);
    }

    public void logout() {
        LoginPage loginPage = new LoginPage(this);
        Graphic.pages.LoginPage loginPageGr = new Graphic.pages.LoginPage(loginPage);
        graphicPageManager.logout(loginPageGr);
    }


    public void enterToChangingPasswordPage() {

    }

    public void enterToCourseList(MainPage page) {
        model.pages.registrationAffairs.CourseListPage courseListPage = new model.pages.registrationAffairs.CourseListPage(page.getUser(), this, semester.getCourses());
        CourseListPage courseListPageGr = new CourseListPage(courseListPage);
        graphicPageManager.changePage(page.getUser(), courseListPageGr);
    }

    public void enterToMasterList(MainPage mainPage) {
        model.pages.registrationAffairs.MastersListPage mastersListPage =
                new model.pages.registrationAffairs.MastersListPage(mainPage.getUser(),
                        this, semester.getMasters());
        MastersListPage mastersListPageGr = new MastersListPage(mastersListPage);
        graphicPageManager.changePage(mainPage.getUser(), mastersListPageGr);
    }
}
