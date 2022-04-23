package model.person.master;

import utils.Dao;

import java.util.ArrayList;
import java.util.Optional;

public class MasterDAO implements Dao<Master> {
    private ArrayList<Master> masterList;

    public MasterDAO(ArrayList<Master> masterList) {
        this.masterList = masterList;
    }

    public MasterDAO() {
        this.masterList = new ArrayList<>();
    }

    @Override
    public Optional<Master> get(String id) {
        for (Master master : masterList) {
            if (master.getId().equals(id))
                return Optional.of(master);
        }
        return Optional.empty();
    }

    public Optional<Master> getByName(String firstName, String lastName) {
        for (Master master : masterList) {
            if (master.getFirstname().equals(firstName) && master.getLastname().equals(lastName)) {
                return Optional.of(master);
            }
        }
        return Optional.empty();
    }

    @Override
    public ArrayList<Master> getAll() {
        return masterList;
    }

    @Override
    public void save(Master master) {
        setId(master);
        masterList.add(master);
    }

    @Override
    public void delete(Master master) {
        masterList.remove(master);
    }

    @Override
    public void setId(Master master) {
        master.setId(master.getIdentityCode());
    }
}
