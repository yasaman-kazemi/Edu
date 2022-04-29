import model.Department;
import model.course.*;
import model.pages.PageManager;
import model.pages.mainPage.EducationalStatus;
import model.person.master.Master;
import model.person.master.MasterDegree;
import model.person.master.MasterPosition;
import model.person.student.Grade;
import model.person.student.Student;
import model.person.student.StudentStatus;
import model.samester.Semester;

import java.io.File;
import java.time.Instant;
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

        ArrayList<Date> riazi1WeeklyClass = new ArrayList<>();
        Instant i1 = Instant.parse("2022-06-04T04:00:00Z");
        Instant i2 = Instant.parse("2022-06-06T04:00:00Z");
        riazi1WeeklyClass.add(Date.from(i1));
        riazi1WeeklyClass.add(Date.from(i2));

        ArrayList<Assignment> riazi1Exam = new ArrayList<>();
        Assignment exam = new Assignment(Date.from(i2), Date.from(i1),
                new File("src/main/resources/config.properties"), "Riazi1");
        riazi1Exam.add(exam);

        Course course = new Course("Riazi1", "4001", Department.Math, new ArrayList<>(),
                new ArrayList<>(), new ArrayList<>(students), master, 4, riazi1WeeklyClass,
                riazi1Exam, new ArrayList<>(), Grade.BS);
        courses.add(course);

        Score score = new Score(course, 19, ScoreStatus.Finalized, "", ProtestRespond.InProgress);
        student.addScore(score);

        Semester semester = new Semester(14001, courses, students, masters);
        PageManager pageManager = new PageManager(semester);
        pageManager.logout();
    }
}
