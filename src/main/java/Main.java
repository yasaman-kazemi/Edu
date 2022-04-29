import model.Department;
import model.course.Course;
import model.pages.PageManager;
import model.pages.mainPage.EducationalStatus;
import model.person.master.Master;
import model.person.master.MasterDegree;
import model.person.master.MasterPosition;
import model.person.student.Grade;
import model.person.student.Student;
import model.person.student.StudentStatus;
import model.samester.Semester;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Master master = new Master("Omid", "Mirsadeghi", "OmidMirsadeghi",
                "002378", "1234", "Omid@gmail.com", Department.Math,
                "002378", new Date(System.currentTimeMillis()), 728,
                MasterDegree.FullProfessor, MasterPosition.Master);
        ArrayList<Master> masters = new ArrayList<>();
        masters.add(master);

        Student student = new Student("Yasaman", "Kazemi", "a", "5",
                "1", "yasaman@gmail.com", Department.Math, "0912345", master,
                "13981", Grade.BS, StudentStatus.Studying, new Date(System.currentTimeMillis()),
                EducationalStatus.AllowedToRegister, "8:00");
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);

        ArrayList<Course> courses = new ArrayList<>();
        Course course = new Course("Riazi1", Department.Math, new ArrayList<Course>(), new ArrayList<Course>(), master,
                4, new ArrayList<Date>(), Grade.BS);
        courses.add(course);

        Semester semester = new Semester(14001, courses, students, masters);
        PageManager pageManager = new PageManager(semester);
        pageManager.logout();
    }
}
