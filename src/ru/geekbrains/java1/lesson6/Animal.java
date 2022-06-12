package ru.geekbrains.java1.lesson6;

public abstract class Animal {

    private int run;

    private double jump;

    public Animal(int run, double jump){
        this.run = run;
        this.jump = jump;
    }

    public void run(int distance){
        boolean bool = (run >= distance);
        System.out.println("Dog run: " + bool + " " + run);
    }

    public void jump(double height){
        boolean bool = (jump >= height);
        System.out.println("Dog jump: " + bool + " " + jump);
    }

    public abstract void swim(double distance);

}
