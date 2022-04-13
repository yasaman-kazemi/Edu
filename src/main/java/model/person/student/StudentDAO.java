package model.person.student;

import utils.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDAO implements Dao<Student> {
    private List<Student> studentList;
    private int counter = 100000;

    public StudentDAO(List<Student> studentList) {
        this.studentList = new ArrayList<>();
    }

    @Override
    public Optional<Student> get(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) return Optional.of(student);
        }
        return Optional.empty();
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public void save(Student student) {
        setId(student);
        studentList.add(student);
    }

    @Override
    public void delete(Student student) {
        studentList.remove(student);
    }

    @Override
    public void setId(Student student) {
        counter++;
        String id = student.getEnteringYear() + String.valueOf(counter).substring(1);
        student.setId(id);
    }
}
