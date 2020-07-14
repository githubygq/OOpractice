package com.thoughtworks.OOpractice;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void Person_Test(){
        //given
       Person person = new Person();

        //when
        String actual = person.introduce();

        //then
        assertEquals(actual,"My name is Tom. I am 21 years old.");
    }
}
