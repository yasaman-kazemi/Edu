package model.pages.educationalServices.request;

import java.util.Date;

public abstract class Request {
    protected Date dateOfSubmit;
    protected String text;
    protected String firstname;
    protected String lastname;
    protected String studentId;

    public Request(Date dateOfSubmit, String firstname, String lastname, String studentId) {
        this.dateOfSubmit = dateOfSubmit;
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentId = studentId;
    }

    public Date getDateOfSubmit() {
        return dateOfSubmit;
    }

    public void setDateOfSubmit(Date dateOfSubmit) {
        this.dateOfSubmit = dateOfSubmit;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
