package model.pages.educationalServices.response;

import model.course.Course;
import model.course.Score;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class RecommendationRespond extends Response {
    public Map<Course, Score> courseScoreMap;
    public List<Course> taCourses;

    public RecommendationRespond(Date dateOfSubmit, String firstname, String lastname,
                                 String studentFirstname, String studentLastname, String studentId,
                                 Map<Course,Score> courseScoreMap, List<Course> taCourses) {
        super(dateOfSubmit, firstname, lastname, studentFirstname, studentLastname, studentId);
        this.courseScoreMap = courseScoreMap;
        this.taCourses = taCourses;
        setText( "اینجانب...گواهی می‌دهم که آقا/خانم...به شماره دانشجویی...درس‌های..." +
                "را با نمره‌ی...گذرانده‌اند و همچنین در دروس...به عنوان دستیار آموزشی فعالیت داشته‌اند.");
    }

    public Map<Course, Score> getCourseScoreMap() {
        return courseScoreMap;
    }

    public void setCourseScoreMap(Map<Course, Score> courseScoreMap) {
        this.courseScoreMap = courseScoreMap;
    }

    public List<Course> getTaCourses() {
        return taCourses;
    }

    public void setTaCourses(List<Course> taCourses) {
        this.taCourses = taCourses;
    }
}
