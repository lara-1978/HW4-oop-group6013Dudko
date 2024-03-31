package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import data.Teacher;

public class TeacherService implements UserService<Teacher> { //класс который работает со студентами и это наследник UserService

    private static Teacher[] teacherlist;
    private static Object TeacherId;
    private final List<Teacher> teachers;


    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override  // медод создания наших учителей
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher: teachers){
                if (teacher.getTeacherId() > countMaxId){
                    countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);
    }

    public static void editTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        for (Teacher teacher:teacherlist) {
            if (teacher.getTeacherId().equals(TeacherId)){
                teacher.setSecondName(secondName);
                teacher.setFirstName(firstName);
                teacher.setPatronymic(patronymic);
            }
        }
    }
}