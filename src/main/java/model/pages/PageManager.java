package model.pages;


import Graphic.GraphicPageManager;
import Graphic.pages.*;
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

    public void enterToMainPage(MainPage page) {
        MainPage mainPage = new MainPage(page.getUser(), this);
        Graphic.pages.mainPage.MainPage mainPageGr = new Graphic.pages.mainPage.MainPage(mainPage);
        graphicPageManager.changePage(page.getUser(), mainPageGr);
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

    public void enterToWeeklySchedule(MainPage mainPage) {
        model.pages.educationalServices.WeeklySchedulePage weeklySchedulePage =
                new model.pages.educationalServices.WeeklySchedulePage(mainPage.getUser(), this);
        WeeklySchedulePage weeklySchedulePageGr = new WeeklySchedulePage(weeklySchedulePage);
        graphicPageManager.changePage(mainPage.getUser(), weeklySchedulePageGr);
    }

    public void enterToExamList(MainPage mainPage) {
        model.pages.educationalServices.ExamListPage examListPage =
                new model.pages.educationalServices.ExamListPage(mainPage.getUser(), this);
        ExamListPage examListPageGr = new ExamListPage(examListPage);
        graphicPageManager.changePage(mainPage.getUser(), examListPageGr);
    }

    public void enterToRequests(MainPage mainPage) {
        model.pages.educationalServices.RequestsPage requestsPage =
                new model.pages.educationalServices.RequestsPage(mainPage.getUser(), this);
        StudentRequestPage requestPageGr = new StudentRequestPage(requestsPage);
        graphicPageManager.changePage(mainPage.getUser(), requestPageGr);
    }

    public void enterToTemporaryScores(MainPage mainPage) {
        model.pages.reportedCardAffairs.TemporaryScoresPage temporaryScoresPage =
                new model.pages.reportedCardAffairs.TemporaryScoresPage(mainPage.getUser(), this);
        TemporaryScoresPage temporaryScoresPageGr = new TemporaryScoresPage(temporaryScoresPage);
        graphicPageManager.changePage(mainPage.getUser(), temporaryScoresPageGr);
    }

    public void enterToEducationalStatus(MainPage mainPage) {
        model.pages.reportedCardAffairs.StudentEducationalStatusPage educationalStatusPage =
                new model.pages.reportedCardAffairs.StudentEducationalStatusPage(mainPage.getUser(), this);
        StudentEducationalStatusPage educationalStatusPageGr = new StudentEducationalStatusPage(educationalStatusPage);
        graphicPageManager.changePage(mainPage.getUser(), educationalStatusPageGr);
    }
}
