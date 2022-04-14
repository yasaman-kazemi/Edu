package model.pages.educationalServices.response;

import java.util.Date;

public class ThesisDefenseResponse extends Response {
    private Date thesisDefenseDate;

    public ThesisDefenseResponse(Date dateOfSubmit, String firstname, String lastname, String studentFirstname,
                                 String studentLastname, String studentId, Date thesisDefenseDate) {
        super(dateOfSubmit, firstname, lastname, studentFirstname, studentLastname, studentId);
        this.thesisDefenseDate = thesisDefenseDate;
        setText( "در تاریخ...می‌توانید از پایان‌نامه خود دفاع کنید.");
    }

    public Date getThesisDefenseDate() {
        return thesisDefenseDate;
    }

    public void setThesisDefenseDate(Date thesisDefenseDate) {
        this.thesisDefenseDate = thesisDefenseDate;
    }
}
