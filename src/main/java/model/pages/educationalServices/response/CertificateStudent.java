package model.pages.educationalServices.response;

import java.util.Date;

public class CertificateStudent extends Response {
    private Date expirationDate;

    public CertificateStudent(Date dateOfSubmit, String firstname, String lastname, String studentFirstname,
                              String studentLastname, String studentId, Date expirationDate) {
        super(dateOfSubmit, firstname, lastname, studentFirstname, studentLastname, studentId);
        this.expirationDate = expirationDate;
        setText("گواهی می‌شود که آقا/خانم...به شماره دانشجویی...،مشغول به تحصیل " +
                "در رشته‌ی...در دانشگاه...است. تاریخ اعتبار گواهی:...");
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
