package model.pages.educationalServices;

import model.course.Course;
import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeeklySchedulePage extends MainPage {
    private List<Course> courseList;

    public WeeklySchedulePage(User user, PageManager pageManager) {
        super(user, pageManager);
        courseList = new ArrayList<>();
    }

    public WeeklySchedulePage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
        courseList = new ArrayList<>();
    }
}
