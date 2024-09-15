package ru.gb.oseminar.view;

import ru.gb.oseminar.data.StudentGroup;
import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.TeacherGroup;

import java.util.List;
import java.util.logging.Logger;

//todo Здесь находится домашнее задание
public class TeacherView implements UserView<Teacher> {
    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for (Teacher user : teachers) {
logger.info(user.toString());
        }
    }
    public void sendOnConsoleUserGroup(TeacherGroup teacherGroup){
        logger.info(teacherGroup.toString());
    }

}

