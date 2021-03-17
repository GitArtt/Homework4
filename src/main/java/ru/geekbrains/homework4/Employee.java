package ru.geekbrains.homework4;

import java.math.BigInteger;

public class Employee {
    String fullName;
    String post;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee(String fullName, String post, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Имя: " + fullName + "\nДолжность: " + post + "\nЭл. почта: " + email +
                "\nТелефон: " + phoneNumber + "\nЗарплата: " + salary + "р" + "\nВозраст: " + age + "\n");


    }

}
