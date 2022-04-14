package model.person.master;

import model.Department;
import model.person.User;

import java.io.File;
import java.util.Date;


public class Master extends User {
    private int roomNumber;
    private MasterDegree masterDegree;
    private MasterPosition masterPosition;

    public Master(String firstname, String lastname, String username,
                  String identityCode, String password, String email,
                  Department department, String phoneNumber, Date lastLogin, int roomNumber,
                  MasterDegree masterDegree, MasterPosition masterPosition) {
        super(firstname, lastname, username, identityCode, password, email, department, phoneNumber, lastLogin);
        this.roomNumber = roomNumber;
        this.masterDegree = masterDegree;
        this.masterPosition = masterPosition;
    }

    public Master(String firstname, String lastname, String username,
                  String id, String identityCode, String password, String email,
                  File photo, Department department, String phoneNumber,Date lastLogin, int roomNumber, MasterDegree masterDegree,
                  MasterPosition masterPosition) {
        super(firstname, lastname, username, id, identityCode, password, email, photo, department, phoneNumber,lastLogin);
        this.roomNumber = roomNumber;
        this.masterDegree = masterDegree;
        this.masterPosition = masterPosition;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public MasterDegree getMasterDegree() {
        return masterDegree;
    }

    public void setMasterDegree(MasterDegree masterDegree) {
        this.masterDegree = masterDegree;
    }

    public MasterPosition getMasterPosition() {
        return masterPosition;
    }

    public void setMasterPosition(MasterPosition masterPosition) {
        this.masterPosition = masterPosition;
    }
}
