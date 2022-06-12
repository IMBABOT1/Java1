package ru.geekbrains.java1.lesson6;

public class Dog extends Animal {

    private int swim;

    public Dog(int run, double jump, int swim) {
        super(run, jump);
        this.swim = swim;
    }

    @Override
    public void swim(double distance) {
        boolean bool = (swim >= distance);
        System.out.println("swim: " + bool + " " + swim);
    }
}
