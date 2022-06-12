package ru.geekbrains.java1.lesson6;

public class Cat extends Animal {
    public Cat(int run, double jump) {
        super(run, jump);
    }


    public void swim() {
        System.out.println("cat can't swim");
    }
}
