package view;

import java.util.List;
import java.util.logging.Logger;

import data.Teacher;

public class TeacherView implements UserView<Teacher>{ //работаем с классом Teacher т.е. который является наследником класса userView /Тоже самое можем делать с контроллером

    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher teacher: teachers){
            logger.info(teacher.toString());
        }
    }

    public void sendOnConsoleUserGroup(Teacher teacher){
        logger.info(teacher.toString());
    }

}
