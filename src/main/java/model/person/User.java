package model.person;

import model.Department;

import java.io.File;
import java.util.Date;

public abstract class User {
    protected String firstname;
    protected String lastname;
    protected String username;
    protected String id;
    protected String identityCode;
    protected String password;
    protected String email;
    protected File photo;
    protected Department department;
    protected String phoneNumber;
    protected Date lastLogin;


    public User(String firstname, String lastname, String username,
                String identityCode, String password, String email,
                Department department, String phoneNumber, Date lastLogin) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.identityCode = identityCode;
        this.password = password;
        this.email = email;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.lastLogin = lastLogin;
    }

    public User(String firstname, String lastname, String username, String id,
                String identityCode, String password, String email,
                File photo, Department department, String phoneNumber, Date lastLogin) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.id = id;
        this.identityCode = identityCode;
        this.password = password;
        this.email = email;
        this.photo = photo;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.lastLogin = lastLogin;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (this.id == null) this.id = id;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public void changeTheme() {

    }
}
