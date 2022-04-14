package model.pages.educationalServices.request;

import model.Department;

import java.util.Date;

public class QuitRequest extends Request {
    private Department department;

    public QuitRequest(Date dateOfSubmit, String firstname, String lastname, String studentId, Department department) {
        super(dateOfSubmit, firstname, lastname, studentId);
        this.department = department;
        setText("اینجانب آقا/خانم...در حال تحصیل در رشته...خواستار انصراف از تحصیل هستم.");
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
