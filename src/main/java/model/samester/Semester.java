package model.samester;

import model.Department;
import model.course.Course;
import model.course.CourseDAO;
import model.course.Score;
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

import java.util.*;

public class Semester {
    private int semesterNumber;
    private Map<String, Dao<?>> daoMap;

    public Semester(int semesterNumber,
                    ArrayList<Course> courseList, ArrayList<Student> studentList, ArrayList<Master> masterList) {
        this.semesterNumber = semesterNumber;
        daoMap = new HashMap<>();
        initial(courseList, studentList, masterList);
    }

    public Semester(int semesterNumber, Map<String, Dao<?>> daoMap) {
        this.semesterNumber = semesterNumber;
        this.daoMap = daoMap;
    }

    public void initial(ArrayList<Course> courseList, ArrayList<Student> studentList, ArrayList<Master> masterList) {
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
                           Department department, String phoneNumber, Date lastLogin, int roomNumber,
                           MasterDegree masterDegree, MasterPosition masterPosition) {
        Master master = new Master(firstname, lastname, username, identityCode,
                password, email, department, phoneNumber, lastLogin,
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
                           ArrayList<Course> prerequisitesCourse, ArrayList<Course> corequisitesCourse,
                           Master master, int courseCredit,
                           ArrayList<Date> weeklyClassDate, Grade grade) {
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

    public List<Course> getCourses(Master master) {
        CourseDAO courseDAO = (CourseDAO) daoMap.get("course");
        return courseDAO.getByMaster(master);
    }
}
