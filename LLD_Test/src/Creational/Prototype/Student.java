package Creational.Prototype;

public class Student implements Prototype{
    int age;
    String name;
    String rollNo;

    Student(int age, String name, String rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode()) + "->" + this.name + ": " + this.age + ": " + this.rollNo;
    }

    @Override
    public Prototype clone() {
        return new Student(this.age, this.name, this.rollNo);
    }
}
