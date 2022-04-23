package model.pages.reportedCardAffairs;

import model.course.*;
import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;
import model.person.master.Master;
import model.person.master.MasterPosition;
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

    public List<Score> getAllTemporaryScores() {
        if (user instanceof Student) {
            return ((Student) user).getScoreByStatus(ScoreStatus.Temporary);
        }
        return new ArrayList<>();
    }

    public void setProtest(Score temporaryScore, String protest) {
        if (temporaryScore.getScoreStatus() == ScoreStatus.Temporary)
            if (temporaryScore.getProtest() == null)
                temporaryScore.setProtest(protest);
    }

    public ProtestRespond getProtestResult(Score score) {
        return score.getProtestRespond();
    }

    public List<Student> getAllCourseStudent(Course course) {
        return course.getStudentList();
    }

    public void setScore(Student student, Course course, double score) {
        Score newScore = new Score(course, score);
        if (user instanceof Master)
            if (course.getStudentList().contains(student))
                student.getScores().add(newScore);
    }

    public void editScore(Score score, double newScore) {
        if (user instanceof Master)
            score.setScore(newScore);
    }

    public boolean hasBeenScoredTemporaryAll(Course course) {
        if (user instanceof Master) {
            for (Student student : course.getStudentList()) {
                if (student.getScore(course) == null)
                    return false;
            }
            return true;
        }
        return false;
    }

    public void finalizedScore(Score temporaryScore, Course course) {
        if (user instanceof Master && hasBeenScoredTemporaryAll(course))
            temporaryScore.setScoreStatus(ScoreStatus.Finalized);
    }

    public List<Score> getProtestedScores(Course course) {
        List<Score> result = new ArrayList<>();
        if (user instanceof Master) {
            for (Score score : course.getAllScores()) {
                if (score.getProtest() != null)
                    result.add(score);
            }
        }
        return result;
    }

    public void responseProtest(ProtestRespond protestRespond, Score score) {
        if (user instanceof Master)
            score.setProtestRespond(protestRespond);
    }

    public List<Score> getAllScores(Course course) {
        return course.getAllScores();
    }

    public List<Score> getTemporaryScore(Student student) {
        if (user instanceof Master && ((Master) user).getMasterPosition().equals(MasterPosition.Assistant) ||
                user instanceof Student)
            return student.getScoreByStatus(ScoreStatus.Temporary);
        return null;
    }

    public List<Score> getFinalizedScore(Student student) {
        if (user instanceof Master && ((Master) user).getMasterPosition().equals(MasterPosition.Assistant) ||
                user instanceof Student)
            return student.getScoreByStatus(ScoreStatus.Finalized);
        return null;
    }

    public List<Score> getScore(Master master) {
        List<Score> result = new ArrayList<>();
        List<Course> courses = pageManager.getSemester().getCourses(master);
        for (Course course : courses) {
            result.addAll(course.getAllScores());
        }
        return result;
    }

    public CourseSummery getSummeryOfCourse(Course course) {
        return new CourseSummery(course.getTotalAverage(), course.getNumberOfPasses(),
                course.getNumberOfFailed(), course.getTotalAverageWithoutFailuresFor());
    }

    public int getNumberOfPassedCourses() {
        int result = 0;
        if (user instanceof Student ||
                (user instanceof Master && ((Master) user).getMasterPosition().equals(MasterPosition.Assistant)))
            for (Score score : ((Student) user).getScores()) {
                if (((Student) user).isPassed(score))
                    result += score.getCourse().getCourseCredit();
            }
        return result;
    }
}

