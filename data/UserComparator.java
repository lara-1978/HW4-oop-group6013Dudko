package data;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {//теперь мы можем работать с любым наследником класса User и добавили типизацию

    @Override
    public int compare(T o1, T o2) { //тут сравнение по фио
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
