package model.pages.educationalServices;

import model.person.User;

import java.util.Date;

public class Request {
    private Date dateOfSubmit;
    private RequestType requestType;
    private String respond;

    public Request(Date dateOfSubmit, RequestType requestType) {
        this.dateOfSubmit = dateOfSubmit;
        this.requestType = requestType;
    }


}
