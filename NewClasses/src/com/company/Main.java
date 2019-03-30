package com.company;
class Person {
    int age;
    String name;
}

public class Main {

    public static void main(String[] args) {
	Person person1 = new Person();
	person1.name = "Joes Bloggs";
	person1.age = 42;

        System.out.println(person1.age);
    }
}
