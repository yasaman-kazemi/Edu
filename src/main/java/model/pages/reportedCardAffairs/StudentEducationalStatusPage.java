package model.pages.reportedCardAffairs;

import model.course.Score;
import model.course.ScoreStatus;
import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;
import model.person.student.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentEducationalStatusPage extends MainPage {

    public StudentEducationalStatusPage(User user, PageManager pageManager) {
        super(user, pageManager);
    }

    public StudentEducationalStatusPage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
    }

    public int getTotalPassedCredit(Student student) {
        return student.getTotalPassedCredit();
    }

    public List<Score> getAllFinalizedScores(Student student) {
        return student.getScoreByStatus(ScoreStatus.Finalized);
    }

    public double getAverageScore(Student student) {
        return student.getTotalAverageScore();
    }
}

