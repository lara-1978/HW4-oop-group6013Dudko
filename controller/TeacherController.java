package controller;
import java.time.LocalDate;

import data.Teacher;
import service.TeacherService;
import view.TeacherView;

public class TeacherController implements UserController <Teacher>{

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();


    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
    }

    public TeacherService getDataService() {

        return teacherService;
    }

    public TeacherView getTeacherView() {
        return teacherView;
    }

    public void editTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        TeacherService.editTeacher(firstName, secondName, patronymic, dateOfBirth);
    }
    public void printTeachers(){
        teacherView.sendOnConsole(teacherService.getAll());
    }

}