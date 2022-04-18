package model.person.student;

import model.Department;
import model.course.Course;
import model.course.CourseDAO;
import model.course.Score;
import model.course.ScoreStatus;
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
    private List<Score> scores;
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
        scores = new ArrayList<>();
    }

    public Student(String firstname, String lastname, String username, String id, String identityCode,
                   String password, String email, File photo, Department department,
                   String phoneNumber, double totalAverageScore, Master guideMaster,
                   String enteringYear, Grade grade, StudentStatus studentStatus,
                   List<Course> currentCourses, List<Score> scores, Date lastLogin,
                   EducationalStatus educationalStatus, String rand) {
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

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
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

    public Score searchScore(String course) {
        for (Score score : scores)
            if (score.getCourse().equals(course)) return score;
        return null;
    }

    public List<Score> getScoreByStatus(ScoreStatus scoreStatus) {
        ArrayList<Score> scoreArrayList = new ArrayList<>();
        for (Score score : scores) {
            if (score.getScoreStatus().equals(scoreStatus)) scoreArrayList.add(score);
        }
        return scoreArrayList;
    }

    public boolean isPassed(Score score) {
        return score.getScore() >= 10.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Double.compare(student.getTotalAverageScore(), getTotalAverageScore()) == 0 &&
                Objects.equals(getGuideMaster(), student.getGuideMaster()) &&
                Objects.equals(getEnteringYear(), student.getEnteringYear()) &&
                getGrade() == student.getGrade() &&
                getStudentStatus() == student.getStudentStatus() &&
                Objects.equals(getCurrentCourses(), student.getCurrentCourses()) &&
                Objects.equals(getScores(), student.getScores()) &&
                getEducationalStatus() == student.getEducationalStatus() &&
                Objects.equals(getRand(), student.getRand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTotalAverageScore(), getGuideMaster(), getEnteringYear(), getGrade(), getStudentStatus(), getCurrentCourses(), getScores(), getEducationalStatus(), getRand());
    }
}
