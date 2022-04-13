package model.pages.registrationAffairs;

import model.Department;
import model.course.Course;
import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;
import model.person.master.Master;
import model.person.master.MasterDegree;
import model.person.master.MasterPosition;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MastersListPage extends MainPage implements Searchable<Master> {
    private List<Master> masterList;
    private String firstname;
    private String lastname;
    private MasterDegree masterDegree;
    private Department department;

    //todo check constructors and whole class
    public MastersListPage(User user, List<Master> masterList) {
        super(user);
        this.masterList = masterList;
    }

    public MastersListPage(User user, List<Master> masterList, String firstname,
                           String lastname, MasterDegree masterDegree, Department department) {
        super(user);
        this.masterList = masterList;
        this.firstname = firstname;
        this.lastname = lastname;
        this.masterDegree = masterDegree;
        this.department = department;
    }

    public MastersListPage(Date now, Date lastLogin, User user, PageManager pageManager,
                           List<Master> masterList, String firstname, String lastname,
                           MasterDegree masterDegree, Department department) {
        super(now, lastLogin, user, pageManager);
        this.masterList = masterList;
        this.firstname = firstname;
        this.lastname = lastname;
        this.masterDegree = masterDegree;
        this.department = department;
    }

    public List<Master> getMasterList() {
        return masterList;
    }

    public void setMasterList(List<Master> masterList) {
        this.masterList = masterList;
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

    public MasterDegree getMasterDegree() {
        return masterDegree;
    }

    public void setMasterDegree(MasterDegree masterDegree) {
        this.masterDegree = masterDegree;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public List<Master> search() {
        List<Master> suitableMasters = new ArrayList<>();
        for (Master master : masterList)
            if (master.getDepartment().equals(department) ||
                    master.getFirstname().equals(firstname) || master.getLastname().equals(lastname) ||
                    master.getMasterDegree().equals(masterDegree)) suitableMasters.add(master);
        return suitableMasters;
    }

    public void delete(Master master) {
        if (user instanceof Master)
            if (((Master) user).getMasterPosition() == MasterPosition.Manager) masterList.remove(master);
    }

    public void add(Master master) {
        if (user instanceof Master)
            if (((Master) user).getMasterPosition() == MasterPosition.Manager) masterList.add(master);
    }

    //todo fill this method
    public void update() {

    }

    public void putAssistant(Master master) {
        if (user instanceof Master)
            if (((Master) user).getMasterPosition() == MasterPosition.Manager) {
                if (department.getAssistant() == null) department.setAssistant(master);
                else {
                    department.getAssistant().setMasterPosition(MasterPosition.Master);
                    department.setAssistant(master);
                }
            }
    }

}
