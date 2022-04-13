package model.person.student;

import model.Department;
import model.course.Course;
import model.course.Score;
import model.pages.mainPage.EducationalStatus;
import model.person.User;
import model.person.master.Master;

import java.io.File;
import java.util.*;

public class Student extends User {
    private double totalAverageScore;
    private Master guideMaster;
    private String enteringYear;
    private Grade grade;
    private StudentStatus studentStatus;
    private List<Course> currentCourses;
    private Map<Course, Score> scores;
    private EducationalStatus educationalStatus;
    private String rand;

    public Student(String firstname, String lastname, String username,
                   String identityCode, String password, String email,
                   Department department, String phoneNumber, Master guideMaster,
                   String enteringYear, Grade grade, StudentStatus studentStatus, Date lastLogin, EducationalStatus educationalStatus, String rand) {
        super(firstname, lastname, username, identityCode, password, email, department, phoneNumber, lastLogin);
        this.guideMaster = guideMaster;
        this.enteringYear = enteringYear;
        this.grade = grade;
        this.studentStatus = studentStatus;
        this.educationalStatus = educationalStatus;
        this.rand = rand;
        currentCourses = new ArrayList<>();
        scores = new HashMap<>();
    }

    public Student(String firstname, String lastname, String username, String id, String identityCode,
                   String password, String email, File photo, Department department,
                   String phoneNumber, double totalAverageScore, Master guideMaster,
                   String enteringYear, Grade grade, StudentStatus studentStatus,
                   List<Course> currentCourses, Map<Course, Score> scores, Date lastLogin, EducationalStatus educationalStatus, String rand) {
        super(firstname, lastname, username, id, identityCode, password,
                email, photo, department, phoneNumber, lastLogin);
        this.totalAverageScore = totalAverageScore;
        this.guideMaster = guideMaster;
        this.enteringYear = enteringYear;
        this.grade = grade;
        this.studentStatus = studentStatus;
        this.currentCourses = currentCourses;
        this.scores = scores;
        this.educationalStatus = educationalStatus;
        this.rand = rand;
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

    public Grade getStudentRole() {
        return grade;
    }

    public void setStudentRole(Grade grade) {
        this.grade = grade;
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

    public EducationalStatus getEducationalStatus() {
        return educationalStatus;
    }

    public void setEducationalStatus(EducationalStatus educationalStatus) {
        this.educationalStatus = educationalStatus;
    }

    public String getRand() {
        return rand;
    }

    public void setRand(String rand) {
        this.rand = rand;
    }
}
