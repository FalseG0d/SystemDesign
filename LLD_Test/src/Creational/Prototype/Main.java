package Creational.Prototype;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(26, "Apoorv Garg", "658957");
        Student s2 = (Student) s1.clone();

        System.out.println(s1);
        System.out.println(s2);
    }
}
