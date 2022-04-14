package model.pages.educationalServices.request;

import model.Department;

import java.util.Date;

public class MinorRequest extends Request {
    private double totalAverageScore;
    private Department department;
    private Department minorDepartment;

    public MinorRequest(Date dateOfSubmit, String firstname, String lastname, String studentId,
                        double totalAverageScore, Department department, Department minorDepartment) {
        super(dateOfSubmit, firstname, lastname, studentId);
        this.totalAverageScore = totalAverageScore;
        this.department = department;
        this.minorDepartment = minorDepartment;
        setText("اینجانب آقا/خانم...با معدل...و در حال تحصیل در رشته...خواستار ماینور در رشته...هستم.");
    }

    public double getTotalAverageScore() {
        return totalAverageScore;
    }

    public void setTotalAverageScore(double totalAverageScore) {
        this.totalAverageScore = totalAverageScore;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getMinorDepartment() {
        return minorDepartment;
    }

    public void setMinorDepartment(Department minorDepartment) {
        this.minorDepartment = minorDepartment;
    }

    //todo check score and ...
}
