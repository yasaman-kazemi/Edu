package model.course;


import java.util.Objects;

public class Score {
    private String course;
    private double score;
    private ScoreStatus scoreStatus;
    private String protest;
    private ProtestRespond protestRespond;

    public Score(String course, double score) {
        this.course = course;
        this.score = score;
        scoreStatus = ScoreStatus.Temporary;
    }

    public Score(String course, double score, ScoreStatus scoreStatus, String protest, ProtestRespond protestRespond) {
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
        if (score < 20 && score > 0) this.score = Math.round(4 * score) / 4.0;
            //todo fill this else with exception
        else {
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
