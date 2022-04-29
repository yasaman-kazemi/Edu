package model.course;

import java.io.File;
import java.util.Date;

public class Assignment implements Comparable<Assignment> {
    private Date deadline;
    private Date start;
    private File questions;
    private File answers;
    private Score score;
    private String course;

    public Assignment(Date deadline, Date start, File questions, String course) {
        this.deadline = deadline;
        this.start = start;
        this.questions = questions;
        this.course = course;
    }

    public Assignment(Date deadline, Date start, File questions, File answers, Score score, String course) {
        this.deadline = deadline;
        this.start = start;
        this.questions = questions;
        this.answers = answers;
        this.score = score;
        this.course = course;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public File getQuestions() {
        return questions;
    }

    public void setQuestions(File questions) {
        this.questions = questions;
    }

    public File getAnswers() {
        return answers;
    }

    public void setAnswers(File answers) {
        this.answers = answers;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    @Override
    public int compareTo(Assignment assignment) {
        return this.start.compareTo(assignment.getStart());
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
