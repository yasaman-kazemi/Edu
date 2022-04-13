package model.pages.mainPage;

import model.course.Course;
import model.pages.mainPage.MainPage;
import model.person.student.Student;

import java.util.List;
import java.util.Map;

public class MasterMainPage extends MainPage {
    private List<Student> studentList;
    private Map<Course,Double> scores;
}
