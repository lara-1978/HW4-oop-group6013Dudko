package service;

import java.time.LocalDate;
import java.util.List;

public interface UserService<T> { // тут можно использовать любой типизатор и это общий интерфейс для всех людей
    List<T> getAll(); //метод получить весь список из этого типа данных

    //создаем по данным нашего нового человека в список
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
