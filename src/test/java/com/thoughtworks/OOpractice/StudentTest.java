package com.thoughtworks.OOpractice;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void Student_Test(){
        //given
        Klass klass = new Klass("2");
        Student student = new Student("Tom","21",klass);
        klass.getStudents().add(student);
        //when
        String actual = student.introduce();

        //then
        assertEquals(actual,"My name is Tom. I am 21 years old. I am a Student of Class 2.");
    }

    @Test
    public void Student_changclass_Test(){
        //given
        //班级1，老师1
        Teacher teacher1 = new Teacher("Jerry1","21","Teacher");
        Klass klass1 = new Klass("1",teacher1);
        //班级2，老师2
        Teacher teacher2 = new Teacher("Jerry2","21","Teacher");
        Klass klass2 = new Klass("2",teacher2);

        //班级1学生
        Student student1 = new Student("Tom1","21",klass1);
        //班级2学生
        Student student2 = new Student("Tom2","21",klass2);
        //目标学生
        Student student = new Student("Tom","21",klass1);

        //目标学生先加入1班
        klass1.getStudents().add(student);
        klass1.getStudents().add(student1);
        klass2.getStudents().add(student2);
        //when
        //目标学生加入二班
        student.changeClass(klass2);
        //String actual = student2.message;
        String actual = teacher2.message;

        //then
        assertEquals(actual,"My name is Tom. I am 21 years old. I am a Student of Class 2 now.");
    }

    @Test
    public void Student_changename_Test(){
        //given
        //班级1，老师1
        Teacher teacher1 = new Teacher("Jerry1","21","Teacher");
        Klass klass1 = new Klass("1",teacher1);

        //班级1学生
        Student student1 = new Student("Tom1","21",klass1);

        //目标学生
        Student student = new Student("Tom","21",klass1);

        //目标学生加入1班
        klass1.getStudents().add(student);
        klass1.getStudents().add(student1);
        //when
        //目标学生改名
        student.changeName("Kerry");
        String actual = student1.message;
        //String actual = teacher1.message;

        //then
        assertEquals(actual,"My name is Kerry. I am 21 years old. I am a Student of Class 1 now.");
    }
}
