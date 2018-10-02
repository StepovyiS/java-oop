
import java.util.ArrayList;
import java.util.List;


class StudentList {
    public List<Student> studentList;
    public String surename;
    public int dateofBirth;

    public void AddStudent() {
        Student student = new Student();
        ArrayList studentsList = new ArrayList();
        studentsList.add(student);

    }

    public StudentList(String surename) {
        this.surename = surename;
    }

    public String getSurename() {
        return surename;
    }

    public int getDateofBirth() {
        return dateofBirth;
    }
}


