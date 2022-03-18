package com.company;

public class Student {
    int stud_id;
    String name;
    String address;
    char grade;
    public static final String INSTNAME ="xyz";


    public void setStud_id(int stud_id) {
        this.stud_id = stud_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    public int getStud_id() {
        return stud_id;
    }
    public String name(){
        return name;
    }
    public String address(){
        return address;
    }

    public char getGrade() {
        return grade;
    }

    public Student(int stud_id, String name, String address, char grade) {
        this.stud_id = stud_id;
        this.name = name;
        this.address = address;
        this.grade = grade;
    }
    public void greet(){
        System.out.println("good morning");
    }
    public static void printCollege(){
        System.out.println(INSTNAME);
    }

    @Override
    public String toString() {
        return "Student{" +
                "stud_id=" + stud_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", grade=" + grade +
                '}';
    }
}
