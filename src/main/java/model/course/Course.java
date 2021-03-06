package model.course;

import model.Department;
import model.person.master.Master;
import model.person.student.Grade;
import model.person.student.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Course {
    private String name;
    private String id;
    private Department department;
    private List<Course> prerequisitesCourse;
    private List<Course> corequisitesCourse;
    private List<Student> studentList;
    private Master master;
    private int courseCredit; //vahed
    private List<Date> weeklyClassDate;
    private List<Assignment> examList;
    private List<Assignment> assignmentList;
    private Grade grade;

    public Course(String name, String id, Department department,
                  List<Course> prerequisitesCourse, List<Course> corequisitesCourse,
                  List<Student> studentList, Master master, int courseCredit,
                  List<Date> weeklyClassDate, List<Assignment> examList,
                  List<Assignment> assignmentList, Grade grade) {
        this(name, department, prerequisitesCourse, corequisitesCourse, master, courseCredit, weeklyClassDate, grade);
        this.id = id;
        this.studentList = studentList;
        for (Student student : studentList) {
            student.addCourse(this);
        }
        this.examList = examList;
        this.assignmentList = assignmentList;
    }

    public Course(String name, Department department,
                  List<Course> prerequisitesCourse, List<Course> corequisitesCourse,
                  Master master, int courseCredit,
                  List<Date> weeklyClassDate, Grade grade) {
        this.name = name;
        this.department = department;
        this.prerequisitesCourse = prerequisitesCourse;
        this.corequisitesCourse = corequisitesCourse;
        this.master = master;
        this.courseCredit = courseCredit;
        this.weeklyClassDate = weeklyClassDate;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (this.id == null) this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Course> getPrerequisitesCourse() {
        return prerequisitesCourse;
    }

    public void setPrerequisitesCourse(List<Course> prerequisitesCourse) {
        this.prerequisitesCourse = prerequisitesCourse;
    }

    public List<Course> getCorequisitesCourse() {
        return corequisitesCourse;
    }

    public void setCorequisitesCourse(List<Course> corequisitesCourse) {
        this.corequisitesCourse = corequisitesCourse;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public List<Date> getWeeklyClassDate() {
        return weeklyClassDate;
    }

    public void setWeeklyClassDate(List<Date> weeklyClassDate) {
        this.weeklyClassDate = weeklyClassDate;
    }

    public List<Assignment> getExamList() {
        return examList;
    }

    public void setExamList(List<Assignment> examList) {
        this.examList = examList;
    }

    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(List<Assignment> assignmentList) {
        this.assignmentList = assignmentList;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public double getTotalAverage() {
        double totalAverage = 0;
        for (Student student : studentList) {
            totalAverage += student.getScore(this).getScore();
        }
        if (studentList.size() > 0) {
            return totalAverage / studentList.size();
        } else {
            return 0;
        }
    }

    public int getNumberOfPasses() {
        int result = 0;
        for (Student student : studentList) {
            if (student.isPassed(student.getScore(this))) result++;
        }
        return result;
    }

    public int getNumberOfFailed() {
        int result = 0;
        for (Student student : studentList) {
            if (!student.isPassed(student.getScore(this))) result++;
        }
        return result;
    }

    public double getTotalAverageWithoutFailures() {
        double totalAverage = 0;
        int n = 0;
        for (Student student : studentList) {
            if (student.isPassed(student.getScore(this))) {
                totalAverage += student.getScore(this).getScore();
                n++;
            }
        }
        if (n == 0) {
            return 0;
        } else {
            return totalAverage / n;
        }
    }

    public List<Score> getAllScores() {
        List<Score> result = new ArrayList<>();
        for (Student student : studentList) {
            result.add(student.getScore(this));
        }
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return getCourseCredit() == course.getCourseCredit() &&
                Objects.equals(getName(), course.getName()) &&
                Objects.equals(getId(), course.getId()) &&
                getDepartment() == course.getDepartment() &&
                Objects.equals(getPrerequisitesCourse(), course.getPrerequisitesCourse()) &&
                Objects.equals(getCorequisitesCourse(), course.getCorequisitesCourse()) &&
                Objects.equals(getStudentList(), course.getStudentList()) &&
                Objects.equals(getMaster(), course.getMaster()) &&
                Objects.equals(getWeeklyClassDate(), course.getWeeklyClassDate()) &&
                Objects.equals(getExamList(), course.getExamList()) &&
                Objects.equals(getAssignmentList(), course.getAssignmentList()) &&
                getGrade() == course.getGrade();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getDepartment(), getPrerequisitesCourse(), getCorequisitesCourse(), getStudentList(), getMaster(), getCourseCredit(), getWeeklyClassDate(), getExamList(), getAssignmentList(), getGrade());
    }
}
