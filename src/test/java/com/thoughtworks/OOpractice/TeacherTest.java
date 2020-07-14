package com.thoughtworks.OOpractice;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TeacherTest {
    @Test
    public void Teacher_Test(){
        //given
       Teacher teacher = new Teacher("Matt","30","Teacher");

        //when
        String actual = teacher.introduce();

        //then
        assertEquals(actual,"My name is Matt. I am 30 years old. I am a Teacher.");
    }
}
