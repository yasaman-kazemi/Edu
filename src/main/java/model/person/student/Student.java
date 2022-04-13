package model.person.student;

import model.Department;
import model.course.Course;
import model.course.Score;
import model.person.User;
import model.person.master.Master;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends User {
    private double totalAverageScore;
    private Master guideMaster;
    private String enteringYear;
    private StudentRole studentRole;
    private StudentStatus studentStatus;
    private List<Course> currentCourses;
    private Map<Course, Score> scores;

    public Student(String firstname, String lastname, String username,
                   String identityCode, String password, String email,
                   Department department, String phoneNumber, Master guideMaster,
                   String enteringYear, StudentRole studentRole, StudentStatus studentStatus) {
        super(firstname, lastname, username,identityCode, password, email, department, phoneNumber);
        this.guideMaster = guideMaster;
        this.enteringYear = enteringYear;
        this.studentRole = studentRole;
        this.studentStatus = studentStatus;
        currentCourses = new ArrayList<>();
        scores = new HashMap<>();
    }

    public Student(String firstname, String lastname, String username,String id, String identityCode,
                   String password, String email, File photo, Department department,
                   String phoneNumber, double totalAverageScore, Master guideMaster,
                   String enteringYear, StudentRole studentRole, StudentStatus studentStatus,
                   List<Course> currentCourses, Map<Course, Score> scores) {
        super(firstname, lastname, username,id, identityCode, password, email, photo, department, phoneNumber);
        this.totalAverageScore = totalAverageScore;
        this.guideMaster = guideMaster;
        this.enteringYear = enteringYear;
        this.studentRole = studentRole;
        this.studentStatus = studentStatus;
        this.currentCourses = currentCourses;
        this.scores = scores;
    }

    public double getTotalAverageScore() {
        return totalAverageScore;
    }

    public void setTotalAverageScore(double totalAverageScore) {
        this.totalAverageScore = totalAverageScore;
    }

    public Master getGuideMaster() {
        return guideMaster;
    }

    public void setGuideMaster(Master guideMaster) {
        this.guideMaster = guideMaster;
    }

    public String getEnteringYear() {
        return enteringYear;
    }

    public void setEnteringYear(String enteringYear) {
        this.enteringYear = enteringYear;
    }

    public StudentRole getStudentRole() {
        return studentRole;
    }

    public void setStudentRole(StudentRole studentRole) {
        this.studentRole = studentRole;
    }

    public StudentStatus getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(StudentStatus studentStatus) {
        this.studentStatus = studentStatus;
    }

    public List<Course> getCurrentCourses() {
        return currentCourses;
    }

    public void setCurrentCourses(List<Course> currentCourses) {
        this.currentCourses = currentCourses;
    }

    public Map<Course, Score> getScores() {
        return scores;
    }

    public void setScores(Map<Course, Score> scores) {
        this.scores = scores;
    }


}
