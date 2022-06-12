package ru.geekbrains.java1.lesson7;

public class Cat {
    private String name;
    private boolean isFull;
    private int amount;

    public Cat(String name, int amount) {
        this.name = name;
        this.isFull = false;
        this.amount = amount;
    }

    public void eat(Plate p) {
        if (p.getFood() >= amount) {
            System.out.println(name + " eating");
            p.decreaseFood(amount);
            isFull = true;
        }else {
            System.out.println("Not enough food");
            isFull = false;
        }
    }

    public void fullNess(){
        if (isFull == true) {
            System.out.println(name + " " + "is full");
        }else {
            System.out.println(name + " " + "hungry");
        }
    }
}
