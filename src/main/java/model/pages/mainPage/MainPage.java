package model.pages.mainPage;

import model.Department;
import model.pages.PageManager;
import model.person.User;
import model.person.master.Master;
import model.person.master.MasterDegree;
import model.person.master.MasterPosition;
import model.person.student.StudentRole;
import model.person.student.StudentStatus;

import java.util.Date;

public class MainPage {
    protected Date now;
    protected Date lastLogin;
    protected User user;
    protected PageManager pageManager;

    public MainPage(User user) {
        this.user = user;
    }

    public MainPage(Date now, Date lastLogin, User user, PageManager pageManager) {
        this.now = now;
        this.lastLogin = lastLogin;
        this.user = user;
        this.pageManager = pageManager;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addStudent(String firstname, String lastname, String username,
                           String identityCode, String password, String email,
                           Department department, String phoneNumber, Master guideMaster,
                           String enteringYear, StudentRole studentRole, StudentStatus studentStatus) {
        if (user instanceof Master)
            if (((Master) user).getMasterPosition() == MasterPosition.Assistant) {
                pageManager.getSemester().saveStudent(firstname, lastname, username,
                        identityCode, password, email, department, phoneNumber, guideMaster,
                        enteringYear, studentRole, studentStatus);
            }
    }

    public void addMaster(String firstname, String lastname, String username,
                          String identityCode, String password, String email,
                          Department department, String phoneNumber, int roomNumber,
                          MasterDegree masterDegree, MasterPosition masterPosition) {
        if (user instanceof Master)
            if (((Master) user).getMasterPosition() == MasterPosition.Assistant) {
                pageManager.getSemester().saveMaster(firstname, lastname, username,
                        identityCode, password, email, department, phoneNumber, roomNumber,
                        masterDegree, masterPosition);
            }
    }

}
