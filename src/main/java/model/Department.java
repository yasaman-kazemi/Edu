package model;

import model.person.master.Master;

public enum Department {
    Physic,
    Math,
    ComputerScience,
    Aerospace,
    ElectronicEngineering,
    CivilEngineering,
    Chemistry,
    Mechanic,
    ComputerEngineering,
    Industry;

    private Master manager;
    private Master assistant;

    public Master getManager() {
        return manager;
    }

    public void setManager(Master manager) {
        this.manager = manager;
    }

    public Master getAssistant() {
        return assistant;
    }

    public void setAssistant(Master assistant) {
        this.assistant = assistant;
    }
}
