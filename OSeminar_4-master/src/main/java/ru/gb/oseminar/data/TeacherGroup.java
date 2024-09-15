package ru.gb.oseminar.data;

import java.util.Iterator;
import java.util.List;
//todo Здесь находится домашнее задание
public class TeacherGroup<T> implements Iterable<T> {
    private List<T> teachers; // Список преподавателей (или других элементов типа T)
    private Student student; // Студент, который связан с группой

    public TeacherGroup(List<T> teachers, Student student) {
        this.teachers = teachers;
        this.student = student;
    }

    public List<T> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<T> teachers) {
        this.teachers = teachers;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "TeacherGroup{" +
                "teachers=" + teachers +
                ", student=" + student +
                '}';
    }

    @Override
    public Iterator<T> iterator() {
        return new TeacherGroupIterator<>(teachers);
    }
}
