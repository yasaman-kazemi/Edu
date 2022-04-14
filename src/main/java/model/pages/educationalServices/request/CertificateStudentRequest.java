package model.pages.educationalServices.request;

import model.Department;

import java.util.Date;

public class CertificateStudentRequest extends Request {
    public Department department;

    public CertificateStudentRequest(Date dateOfSubmit, String firstname, String lastname,
                                     String studentId, Department department) {
        super(dateOfSubmit, firstname, lastname, studentId);
        this.department = department;
        setText("اینجانب آقا/خانم...به شماره دانشجویی...مشغول " +
                "به تحصیل در دانشکده... خواستار گواهی اشتغال به تحصیل می‌باشم.");
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
