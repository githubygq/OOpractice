package com.thoughtworks.OOpractice;

public class Person {
    String name;
    String age;

    public Person(){

    }
    public Person(String name,String age){
        this.name = name;
        this.age = age;
    }
    public String introduce(){
        return "My name is "+name+". I am "+age+" years old.";
    }
}
