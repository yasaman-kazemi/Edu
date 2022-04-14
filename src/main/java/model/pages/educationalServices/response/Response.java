package model.pages.educationalServices.response;

import java.util.Date;

public class Response {
    protected Date dateOfSubmit;
    protected String firstname;
    protected String lastname;
    protected String studentFirstname;
    protected String StudentLastname;
    protected String studentId;
    protected String text;

    public Response(Date dateOfSubmit, String firstname, String lastname, String studentFirstname,
                    String studentLastname, String studentId) {
        this.dateOfSubmit = dateOfSubmit;
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentFirstname = studentFirstname;
        StudentLastname = studentLastname;
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

    public String getStudentFirstname() {
        return studentFirstname;
    }

    public void setStudentFirstname(String studentFirstname) {
        this.studentFirstname = studentFirstname;
    }

    public String getStudentLastname() {
        return StudentLastname;
    }

    public void setStudentLastname(String studentLastname) {
        StudentLastname = studentLastname;
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
