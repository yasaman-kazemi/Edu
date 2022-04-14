package model.pages.reportedCardAffairs;

import model.course.Course;
import model.course.ProtestRespond;
import model.course.Score;
import model.course.ScoreStatus;
import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;
import model.person.master.Master;
import model.person.student.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TemporaryScoresPage extends MainPage {

    public TemporaryScoresPage(User user, PageManager pageManager) {
        super(user, pageManager);
    }

    public TemporaryScoresPage(Date now, User user, PageManager pageManager) {
        super(now, user, pageManager);
    }

    public List<Score> getAll() {
        ArrayList<Score> temporaryScores = new ArrayList<>();
        if (user instanceof Student) {
            for (Score score : ((Student) user).getScores())
                if (score.getScoreStatus().equals(ScoreStatus.Temporary)) temporaryScores.add(score);
        }
        return temporaryScores;
    }

    public void setProtest(Score temporaryScore, String protest) {
        if (temporaryScore.getScoreStatus().equals(ScoreStatus.Temporary))
            temporaryScore.setProtest(protest);
    }

    public void finalizedScore(Score temporaryScore) {
        temporaryScore.setScoreStatus(ScoreStatus.Finalized);
    }

    public void setScore(Student student, Course course, double score) {
        Score newScore = new Score(course.toString(), score);
        if (user instanceof Master)
            if (course.getStudentList().contains(student))
                student.getScores().add(newScore);
    }

    public void editScore(Score score, double newScore) {
        if (user instanceof Master)
            score.setScore(newScore);
    }

    public boolean hasBeenScoredTemporaryAll(Course course) {
        if (user instanceof Master)
            for (Student student : course.getStudentList()) {
                if (student.searchScore(course.getName()) == null) return false;
            }
        return true;
    }

    public void responseProtest(ProtestRespond protestRespond, Score score) {
        if (user instanceof Master)
            score.setProtestRespond(protestRespond);
    }
}

