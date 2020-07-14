package com.thoughtworks.OOpractice;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void Student_Test(){
        //given
       Student student = new Student("Tom","21",2);

        //when
        String actual = student.introduce();

        //then
        assertEquals(actual,"My name is Tom. I am 21 years old. I am a Student of Class 2.");
    }
}
