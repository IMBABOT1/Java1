package ru.geekbrains.java1.lesson6;

public class Cat extends Animal {
    public Cat(int run, double jump) {
        super(run, jump);
    }
    @Override
    public void swim(double distance) {
        System.out.println("cat can't swim");
    }
}
