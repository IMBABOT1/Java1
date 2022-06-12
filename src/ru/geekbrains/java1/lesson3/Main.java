package ru.geekbrains.java1.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static void guessNumber(){
        int amount = 0;
        int tries = 3;
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int number = rnd.nextInt(10);
        System.out.println(number);
        while (amount < tries){
            System.out.println("enter number");
            int n = sc.nextInt();
            if (n == number){
                System.out.println("win");
                break;
            }else if (n > number){
                System.out.println("<");
            }else if (n < number){
                System.out.println(">");
            }
            amount++;
        }
    }

    public static void main(String[] args) {
        guessNumber();
    }
}
