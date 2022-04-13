package model.samester;

import model.Department;
import model.course.Course;
import model.course.CourseDAO;
import model.pages.mainPage.EducationalStatus;
import model.person.master.Master;
import model.person.master.MasterDAO;
import model.person.master.MasterDegree;
import model.person.master.MasterPosition;
import model.person.student.Student;
import model.person.student.StudentDAO;
import model.person.student.Grade;
import model.person.student.StudentStatus;
import utils.Dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Semester {
    private int semesterNumber;
    private Map<String, Dao<?>> daoMap;

    public Semester(int semesterNumber,
                    List<Course> courseList, List<Student> studentList, List<Master> masterList) {
        this.semesterNumber = semesterNumber;
        daoMap = new HashMap<>();
        initial(courseList, studentList, masterList);
    }

    public Semester(int semesterNumber, Map<String, Dao<?>> daoMap) {
        this.semesterNumber = semesterNumber;
        this.daoMap = daoMap;
    }

    public void initial(List<Course> courseList, List<Student> studentList, List<Master> masterList) {
        CourseDAO courseDAO = new CourseDAO(courseList);
        StudentDAO studentDAO = new StudentDAO(studentList);
        MasterDAO masterDAO = new MasterDAO(masterList);
        daoMap.put("course", courseDAO);
        daoMap.put("student", studentDAO);
        daoMap.put("master", masterDAO);
    }

    public int getSemesterNumber() {
        return semesterNumber;
    }

    public void setSemesterNumber(int semesterNumber) {
        this.semesterNumber = semesterNumber;
    }

    public Dao<?> getDao(String daoName) {
        return daoMap.get(daoName);
    }

    public void saveMaster(String firstname, String lastname, String username,
                           String identityCode, String password, String email,
                           Department department, String phoneNumber, int roomNumber,
                           MasterDegree masterDegree, MasterPosition masterPosition) {
        Master master = new Master(firstname, lastname, username, identityCode,
                password, email, department, phoneNumber,
                roomNumber, masterDegree, masterPosition);
        MasterDAO masterDAO = (MasterDAO) daoMap.get("master");
        masterDAO.save(master);
    }

    public void saveStudent(String firstname, String lastname, String username, String identityCode, String password,
                            String email, Department department, String phoneNumber, Master guideMaster,
                            String enteringYear, Grade grade, StudentStatus studentStatus, Date lastLogin,
                            EducationalStatus educationalStatus, String rand) {
        Student student = new Student(firstname, lastname, username, identityCode, password,
                email, department, phoneNumber,
                guideMaster, enteringYear, grade, studentStatus, lastLogin, educationalStatus, rand);
        StudentDAO studentDAO = (StudentDAO) daoMap.get("student");
        studentDAO.save(student);
    }

    public void saveCourse(String name, Department department,
                           List<Course> prerequisitesCourse, List<Course> corequisitesCourse,
                           Master master, int courseCredit,
                           List<Date> weeklyClassDate, Grade grade) {
        Course course = new Course(name, department, prerequisitesCourse, corequisitesCourse, master,
                courseCredit, weeklyClassDate, grade);
        CourseDAO courseDAO = (CourseDAO) daoMap.get("course");
        courseDAO.save(course);
    }

    //TODO if i delete the master what happened to master courses and guide master of students with this master
    public void deleteMaster(Master master) {
        MasterDAO masterDAO = (MasterDAO) daoMap.get("master");
        masterDAO.delete(master);
    }

    public void deleteCourse(Course course) {
        CourseDAO courseDAO = (CourseDAO) daoMap.get("course");
        courseDAO.delete(course);
    }
}
