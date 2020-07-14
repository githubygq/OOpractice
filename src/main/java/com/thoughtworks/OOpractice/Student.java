package com.thoughtworks.OOpractice;

public class Student extends Person {
    //int classNumber;
    Klass klass;
    String message;
    public Student(String name,String age,Klass klass){
        super(name,age);
        this.klass = klass;
    }
    public String introduce(){
        return "My name is "+super.name+". I am "+super.age+" years old. I am a Student of Class "+klass.getNumber()+".";
    }

    public void changeName(String name){
        this.name = name;
        String newMessage =  "My name is "+super.name+". I am "+super.age+" years old. I am a Student of Class "+klass.getNumber()+" now.";
        klass.teacher.message = newMessage;
        for (Student s:klass.students) {
            if(this.name != s.name){
                s.message = newMessage;
            }
        }
    }

    public void changeClass(Klass klass){
        Klass oldKlass = this.klass;
        this.klass = klass;
        String newMessage =  "My name is "+super.name+". I am "+super.age+" years old. I am a Student of Class "+this.klass.getNumber()+" now.";

        oldKlass.teacher.message = newMessage;
        oldKlass.students.remove(this);
        for (Student s:oldKlass.students) {
            s.message = newMessage;
        }

        this.klass.teacher.message = newMessage;
        for (Student s:this.klass.students) {
            s.message = newMessage;
        }
        this.klass.students.add(this);
    }

}
