package com.thoughtworks.OOpractice;

public class Teacher extends Person{
    String job;
    String message;
    public Teacher(String name,String age,String job){
        super(name,age);
        this.job = job;
    }

    public String introduce(){
        return "My name is "+super.name+". I am "+super.age+" years old. I am a "+job+".";
    }

}
