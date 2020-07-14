package com.thoughtworks.OOpractice;

public class Student extends Person {
    int classNumber;

    public Student(String name,String age,int classNumber){
        super(name,age);
        this.classNumber = classNumber;
    }
    public String introduce(){
        return "My name is "+super.name+". I am "+super.age+" years old. I am a Student of Class "+classNumber+".";
    }
}
