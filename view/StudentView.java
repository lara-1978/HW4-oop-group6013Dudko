package view;

import java.util.List;
import java.util.logging.Logger;

import data.Student;
import data.StudentGroup;

public class StudentView implements UserView<Student>{ //работаем с классом Student т.е. который является наследником класса userView /Тоже самое можем делать с контроллером

    Logger logger = Logger.getLogger(StudentView.class.getName());

    @Override
    public void sendOnConsole(List<Student> students) {
        for(Student user: students){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

}
