package com.thoughtworks.OOpractice;

public class Student extends Person {
    //int classNumber;
    Klass klass;
    public Student(String name,String age,Klass klass){
        super(name,age);
        this.klass = klass;
    }
    public String introduce(){
        return "My name is "+super.name+". I am "+super.age+" years old. I am a Student of Class "+klass.getNumber()+".";
    }
}
