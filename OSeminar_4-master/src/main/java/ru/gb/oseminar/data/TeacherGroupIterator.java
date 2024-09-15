package ru.gb.oseminar.data;

import java.util.Iterator;
import java.util.List;
//todo Здесь находится домашнее задание
public class TeacherGroupIterator<T> implements Iterator<T> {
    private final List<T> teachers;
    private int count;

    public TeacherGroupIterator(List<T> teachers) {
        this.teachers = teachers;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < teachers.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        return teachers.get(count++);
    }
}
