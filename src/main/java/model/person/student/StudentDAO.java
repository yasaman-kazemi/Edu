package model.person.student;

import utils.Dao;

import java.util.ArrayList;
import java.util.Optional;

public class StudentDAO implements Dao<Student> {
    private ArrayList<Student> studentList;
    private int counter = 100000;

    public StudentDAO(ArrayList<Student> studentList) {
        this.studentList = new ArrayList<>();
        for (Student student : studentList) {
            save(student);
        }
    }

    @Override
    public Optional<Student> get(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) return Optional.of(student);
        }
        return Optional.empty();
    }

    @Override
    public ArrayList<Student> getAll() {
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

    public Student getByUsername(String username) {
        for (Student student : studentList) {
            if (student.getUsername().equals(username)) return student;
        }
        return null;
    }
}
