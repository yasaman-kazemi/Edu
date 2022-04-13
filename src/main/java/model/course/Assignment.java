package model.course;

import java.io.File;
import java.util.Date;

public class Assignment {
    private Date deadline;
    private Date start;
    private File questions;
    private File answers;
    private Score score;

    public Assignment(Date deadline, Date start, File questions) {
        this.deadline = deadline;
        this.start = start;
        this.questions = questions;
    }

    public Assignment(Date deadline, Date start, File questions, File answers, Score score) {
        this.deadline = deadline;
        this.start = start;
        this.questions = questions;
        this.answers = answers;
        this.score = score;
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
}
