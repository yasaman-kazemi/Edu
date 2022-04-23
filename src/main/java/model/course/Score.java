package model.course;


import java.util.Objects;

public class Score {
    private Course course;
    private double score;
    private ScoreStatus scoreStatus;
    private String protest;
    private ProtestRespond protestRespond;

    public Score(Course course, double score) {
        this.course = course;
        setScore(score);
        scoreStatus = ScoreStatus.Temporary;
    }

    public Score(Course course, double score, ScoreStatus scoreStatus, String protest, ProtestRespond protestRespond) {
        this.course = course;
        this.score = score;
        this.scoreStatus = scoreStatus;
        this.protest = protest;
        this.protestRespond = protestRespond;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Score)) return false;
        Score score1 = (Score) o;
        return Double.compare(score1.getScore(), getScore()) == 0 &&
                Objects.equals(getCourse(), score1.getCourse()) &&
                getScoreStatus() == score1.getScoreStatus() &&
                Objects.equals(getProtest(), score1.getProtest());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourse(), getScore(), getScoreStatus(), getProtest());
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 20 && score > 0) {
            this.score = Math.round(4 * score) / 4.0;
        } else {
            throw new IllegalArgumentException();
        }
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

    public ProtestRespond getProtestRespond() {
        return protestRespond;
    }

    public void setProtestRespond(ProtestRespond protestRespond) {
        this.protestRespond = protestRespond;
    }
}
