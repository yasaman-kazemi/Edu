package model.pages.educationalServices.request;

import java.util.Date;

public class ThesisDefenseRequest extends Request {

    public ThesisDefenseRequest(Date dateOfSubmit, String firstname, String lastname, String studentId) {
        super(dateOfSubmit, firstname, lastname, studentId);
        setText("اینجانب آقا/خانم...خواستار زمانی برای دفاع از پایان‌نامه خود هستم.");
    }
}
