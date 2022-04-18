package model.pages.mainPage;

import model.Department;
import model.pages.ChangingPasswordPage;
import model.pages.PageManager;
import model.person.User;
import model.person.master.Master;
import model.person.master.MasterDegree;
import model.person.master.MasterPosition;
import model.person.student.Grade;
import model.person.student.StudentStatus;

import java.util.Date;

public class MainPage {
    protected Date now;
    protected User user;
    protected PageManager pageManager;

    public MainPage(User user, PageManager pageManager) {
        this.user = user;
        this.pageManager = pageManager;
    }

    public MainPage(Date now, User user, PageManager pageManager) {
        this.now = now;
        this.user = user;
        this.pageManager = pageManager;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
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
                           String enteringYear, Grade grade, StudentStatus studentStatus,
                           Date lastLogin, EducationalStatus educationalStatus, String rand) {
        if (user instanceof Master)
            if (((Master) user).getMasterPosition() == MasterPosition.Assistant) {
                pageManager.getSemester().saveStudent(firstname, lastname, username,
                        identityCode, password, email, department, phoneNumber, guideMaster,
                        enteringYear, grade, studentStatus, lastLogin, educationalStatus, rand);
            }
    }

    public void addMasterByAssistant(String firstname, String lastname, String username,
                                     String identityCode, String password, String email,
                                     Department department, String phoneNumber, Date lastLogin, int roomNumber,
                                     MasterDegree masterDegree, MasterPosition masterPosition) {
        if (user instanceof Master)
            if (((Master) user).getMasterPosition() == MasterPosition.Assistant) {
                addMaster(firstname, lastname, username, identityCode, password, email,
                        department, phoneNumber, lastLogin, roomNumber, masterDegree, masterPosition);
            }
    }

    protected void addMaster(String firstname, String lastname, String username, String identityCode, String password,
                             String email, Department department, String phoneNumber, Date lastLogin, int roomNumber,
                             MasterDegree masterDegree, MasterPosition masterPosition) {
        pageManager.getSemester().saveMaster(firstname, lastname, username,
                identityCode, password, email, department, phoneNumber, lastLogin, roomNumber,
                masterDegree, masterPosition);
    }

    public void logout() {
        pageManager.logout();
    }

    //todo check this method
    public void changePassword(String password) {
        long differenceInMin = (Math.abs(now.getTime() - user.getLastLogin().getTime()) / (60 * 1000));
        if (differenceInMin > 180) {
            ChangingPasswordPage changingPasswordPage = new ChangingPasswordPage(user, pageManager);
            changingPasswordPage.setNewPassword(password);
        }
    }


}
