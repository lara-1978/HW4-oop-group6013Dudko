package view;



import java.util.List;

import data.User;

public interface UserView<T extends User>{// тут сделали отдельный интерфейс+ типизировали
    void sendOnConsole(List<T> list);//метод который принимает список и его выводит
}
