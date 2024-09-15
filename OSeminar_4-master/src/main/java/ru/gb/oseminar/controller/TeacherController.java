package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.service.StudentGroupService;
import ru.gb.oseminar.service.StudentService;
import ru.gb.oseminar.service.TeacherService;
import ru.gb.oseminar.view.StudentView;
import ru.gb.oseminar.view.TeacherView;

import java.time.LocalDate;

//todo Здесь находится домашнее задание
public class TeacherController implements UserController<Teacher> {
    private final TeacherService dataService = new TeacherService(); // todo В этой строке программа просит что бы я добавил что то в скобочки..
    //private final TeacherGroupService studentGroupService = new StudentGroupService(); todo Не понял как его создавать
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }
}
