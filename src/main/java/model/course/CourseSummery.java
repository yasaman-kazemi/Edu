package model.course;

public class CourseSummery {
    private double totalAverage;
    private int passedStudents;
    private int failedStudents;
    private double totalAverageWithoutFailedStudents;

    public CourseSummery(double totalAverage, int passedStudents, int failedStudents,
                         double totalAverageWithoutFailedStudents) {
        this.totalAverage = totalAverage;
        this.passedStudents = passedStudents;
        this.failedStudents = failedStudents;
        this.totalAverageWithoutFailedStudents = totalAverageWithoutFailedStudents;
    }

    public double getTotalAverage() {
        return totalAverage;
    }

    public void setTotalAverage(double totalAverage) {
        this.totalAverage = totalAverage;
    }

    public int getPassedStudents() {
        return passedStudents;
    }

    public void setPassedStudents(int passedStudents) {
        this.passedStudents = passedStudents;
    }

    public int getFailedStudents() {
        return failedStudents;
    }

    public void setFailedStudents(int failedStudents) {
        this.failedStudents = failedStudents;
    }

    public double getTotalAverageWithoutFailedStudents() {
        return totalAverageWithoutFailedStudents;
    }

    public void setTotalAverageWithoutFailedStudents(double totalAverageWithoutFailedStudents) {
        this.totalAverageWithoutFailedStudents = totalAverageWithoutFailedStudents;
    }
}
