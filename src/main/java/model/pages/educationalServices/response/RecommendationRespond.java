package model.pages.educationalServices.response;

import java.util.Date;

public class RecommendationRespond extends Response {

    public RecommendationRespond(Date dateOfSubmit, String firstname, String lastname,
                                 String studentFirstname, String studentLastname, String studentId) {
        super(dateOfSubmit, firstname, lastname, studentFirstname, studentLastname, studentId);
        setText( "اینجانب...گواهی می‌دهم که آقا/خانم...به شماره دانشجویی...درس‌های..." +
                "را با نمره‌ی...گذرانده‌اند و همچنین در دروس...به عنوان دستیار آموزشی فعالیت داشته‌اند.");
    }
}
