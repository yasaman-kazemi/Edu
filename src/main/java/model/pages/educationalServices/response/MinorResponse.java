package model.pages.educationalServices.response;

import java.util.Date;

public class MinorResponse extends Response {

    public MinorResponse(Date dateOfSubmit, String firstname, String lastname, String studentFirstname,
                         String studentLastname, String studentId,MinorResponseStatus minorResponseStatus) {
        super(dateOfSubmit, firstname, lastname, studentFirstname, studentLastname, studentId);
        setText(minorResponseStatus.toString());
    }
}
