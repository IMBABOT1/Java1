package ru.geekbrains.java1.lesson7;



public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("First",100);
        cats[1] = new Cat("Second",10);
        cats[2] = new Cat("Third", 10);
        cats[3] = new Cat("Fourth", 10);
        cats[4] = new Cat("Five", 10);

        Plate p = new Plate(100);
        for (int i = 0; i < cats.length ; i++) {
            cats[i].fullNess();
        }
        System.out.println();
        for (int i = 0; i < cats.length ; i++) {
            cats[i].eat(p);
        }
        System.out.println();
        for (int i = 0; i < cats.length ; i++) {
            cats[i].fullNess();
        }

        System.out.println(p.getFood());
        p.addFood(50);
        System.out.println(p.getFood());
    }
}
