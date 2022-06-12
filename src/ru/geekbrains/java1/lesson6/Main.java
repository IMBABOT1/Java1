package ru.geekbrains.java1.lesson6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog((int)(Math.random() * 800 + 200), 0.5f, 10);
        Cat cat = new Cat(200, 2);

        dog.run(550);
        dog.jump(0.1f);
        dog.swim(5);

        cat.swim(100);
        cat.run(100);
        cat.jump(1);



    }
}
