package model.pages;


import Graphic.GraphicPageManager;
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

    public void enterToMainPage() {
        graphicPageManager.enterToMainPage();
    }

    public void logout() {

    }


    public void enterToChangingPasswordPage() {

    }
}
