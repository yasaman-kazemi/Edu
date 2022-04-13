package model.course;


public class Score {
    private String course;
    private double score;
    private ScoreStatus scoreStatus;
    private String protest;

    public Score(String course, double score) {
        this.course = course;
        this.score = score;
        scoreStatus = ScoreStatus.Temporary;
    }

    public Score(String course, double score, ScoreStatus scoreStatus, String protest) {
        this.course = course;
        this.score = score;
        this.scoreStatus = scoreStatus;
        this.protest = protest;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public ScoreStatus getScoreStatus() {
        return scoreStatus;
    }

    public void setScoreStatus(ScoreStatus scoreStatus) {
        this.scoreStatus = scoreStatus;
    }

    public String getProtest() {
        return protest;
    }

    public void setProtest(String protest) {
        this.protest = protest;
    }
}
