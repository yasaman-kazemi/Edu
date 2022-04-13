package model.pages.registrationAffairs;

import model.Department;
import model.pages.PageManager;
import model.pages.mainPage.MainPage;
import model.person.User;
import model.person.master.Master;
import model.person.master.MasterDAO;
import model.person.master.MasterDegree;
import model.person.master.MasterPosition;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MastersListPage extends MainPage implements Searchable<Master> {
    private List<Master> masterList;
    //filters
    private String firstname;
    private String lastname;
    private MasterDegree masterDegree;
    private Department department;

    //todo check constructors and whole class
    public MastersListPage(User user, PageManager pageManager, List<Master> masterList) {
        super(user, pageManager);
        this.masterList = masterList;
    }

    public MastersListPage(Date now, User user, PageManager pageManager,
                           List<Master> masterList) {
        super(now, user, pageManager);
        this.masterList = masterList;
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
            if ((department == null || master.getDepartment().equals(department)) &&
                    (firstname == null || master.getFirstname().equals(firstname)) &&
                    (lastname == null || master.getLastname().equals(lastname)) &&
                    (masterDegree == null || master.getMasterDegree().equals(masterDegree)))
                suitableMasters.add(master);
        return suitableMasters;
    }

    public void delete(Master master) {
        if (user instanceof Master)
            if (((Master) user).getMasterPosition() == MasterPosition.Manager) {
                pageManager.getSemester().deleteMaster(master);
            }
    }

    public void addMasterByManager(String firstname, String lastname, String username, String identityCode,
                                   String password, String email, Department department, String phoneNumber,
                                   int roomNumber, MasterDegree masterDegree, MasterPosition masterPosition) {
        if (user instanceof Master)
            if (((Master) user).getMasterPosition() == MasterPosition.Manager) addMaster(firstname, lastname, username,
                    identityCode, password, email, department, phoneNumber, roomNumber, masterDegree, masterPosition);
    }

    //todo fill this method
    public void update() {

    }

    public void promoteAssistant(Master master) {
        if (user instanceof Master)
            if (((Master) user).getMasterPosition() == MasterPosition.Manager)
                if (department.getAssistant() == null) {
                    master.setMasterPosition(MasterPosition.Assistant);
                    department.setAssistant(master);
                }
    }

    public void dismissalAssistant() {
        if (user instanceof Master)
            if (((Master) user).getMasterPosition() == MasterPosition.Manager)
                if (department.getAssistant() != null) {
                    department.getAssistant().setMasterPosition(MasterPosition.Master);
                    department.setAssistant(null);
                }

    }

}
