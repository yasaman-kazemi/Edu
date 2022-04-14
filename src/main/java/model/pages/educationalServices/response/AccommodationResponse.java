package model.pages.educationalServices.response;

import java.util.Date;
import java.util.Random;

public class AccommodationResponse extends Response {
    private boolean accommodation;

    public AccommodationResponse(Date dateOfSubmit, String firstname, String lastname, String studentFirstname,
                                 String studentLastname, String studentId, boolean accommodation) {
        super(dateOfSubmit, firstname, lastname, studentFirstname, studentLastname, studentId);
        Random random = new Random();
        if (random.nextBoolean()) setText("Accepted.");
        else setText("Rejected.");
    }

    public boolean isAccommodation() {
        return accommodation;
    }

    public void setAccommodation(boolean accommodation) {
        this.accommodation = accommodation;
    }
}
