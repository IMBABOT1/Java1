package ru.geekbrains.java1.lesson5;

public class Employee {

    private String fio;
    private String position;
    private String mail;
    private int phone;
    private int salary;
    private int age;

    public int getAge(){
        return age;
    }

    public Employee(String fio, String position, String mail, int phone, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println("FIO: " + fio + "; " +
                "position: " + position + "; " +
                "mail: " + mail + "; " +
                "phone: " + phone + "; " +
                "salary: " + salary + "; " +
                "age: " + age);
    }

}
