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
}
