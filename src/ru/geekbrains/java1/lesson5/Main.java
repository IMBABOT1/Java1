package ru.geekbrains.java1.lesson5;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("FIO", "pos", "mail@mail.ru", 88000000, 100, 52);
     //   employee.info();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("FIO", "pos", "mail@mail.ru", 88000000, 100, 52);
        employees[1] = new Employee("FIO1", "pos", "mail@mail.ru", 88000000, 100, 32);
        employees[2] = new Employee("FIO2", "pos", "mail@mail.ru", 88000000, 100, 22);
        employees[3] = new Employee("FIO3", "pos", "mail@mail.ru", 88000000, 100, 18);
        employees[4] = new Employee("FIO4", "pos", "mail@mail.ru", 88000000, 100, 83);


        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].getAge() > 40){
                employees[i].info();
            }
        }
    }
}
