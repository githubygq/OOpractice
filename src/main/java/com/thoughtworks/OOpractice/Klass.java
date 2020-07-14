package com.thoughtworks.OOpractice;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    String number;
    Teacher teacher;
    List<Student> students = new ArrayList<Student>();

    public Klass(String number){
        this.number = number;
    }
    public Klass(String number,Teacher teacher){
        this.number = number;
        this.teacher = teacher;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
