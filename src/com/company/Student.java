package com.company;

public class Student extends Person {
    int Course = 1;

    public Student (int height, String name, int course) {
        super(height, name);
        this.Course = course;
    }

    void tell () {
        System.out.println(super.height);
        System.out.println(super.name);
        System.out.println(Course);
    }

}
