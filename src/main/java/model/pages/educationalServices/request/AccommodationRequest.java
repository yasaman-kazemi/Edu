package model.pages.educationalServices.request;

import java.util.Date;

public class AccommodationRequest extends Request{

    public AccommodationRequest(Date dateOfSubmit, String firstname, String lastname, String studentId) {
        super(dateOfSubmit, firstname, lastname, studentId);
        setText("اینجانب آقا/خانم...خواستار اقامت در خوابگاه هستم.");
    }
}
