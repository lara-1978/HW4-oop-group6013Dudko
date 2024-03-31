package data;

import java.time.LocalDate;

public class Teacher extends User{

    private Long teacherId;

    public Teacher(String firstname, String secondname, String patronymic, LocalDate dateOfBirth, Long countMaxId) {
        super(firstname, secondname, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

}
