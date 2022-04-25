package Graphic.pages;

import model.pages.mainPage.MainPage;

import javax.swing.*;

public class MyPanel extends JPanel {
    protected MainPage page;

    public MyPanel(MainPage page) {
        this.page = page;
    }

    public MainPage getPage() {
        return page;
    }

    public void setPage(MainPage page) {
        this.page = page;
    }
}
