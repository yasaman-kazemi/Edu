package model.pages.educationalServices.request;

import model.course.Course;
import model.course.Score;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class RecommendationRequest extends Request {
    public Map<Course, Score> courseScoreMap;
    public List<Course> taCourses;

    public RecommendationRequest(Date dateOfSubmit, String firstname, String lastname, String studentId,
                                 Map<Course, Score> courseScoreMap, List<Course> taCourses) {
        super(dateOfSubmit, firstname, lastname, studentId);
        this.courseScoreMap = courseScoreMap;
        this.taCourses = taCourses;
        setText("اینجانب آقا/خانم...به شماره دانشجویی...درس‌های...با نمره...گذرانده " +
                "و در دروس...به عنوان دستیار آموزشی فعالیت داشته‌ام و خواستار توصیه‌نامه می‌باشم.");
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
