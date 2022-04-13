package model.person.master;

import utils.Dao;

import java.util.List;
import java.util.Optional;

public class MasterDAO implements Dao<Master> {
    private List<Master> masterList;

    public MasterDAO(List<Master> masterList) {
        this.masterList = masterList;
    }

    @Override
    public Optional<Master> get(String id) {
        for (Master master : masterList) {
            if (master.getId().equals(id)) return Optional.of(master);
        }
        return Optional.empty();
    }

    @Override
    public List<Master> getAll() {
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
