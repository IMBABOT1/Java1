package ru.geekbrains.java1.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    private static void guessWord(){
        String[] words = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        Random rnd = new Random();
        int number = rnd.nextInt(words.length);
        Scanner sc = new Scanner(System.in);
        String sample = "###############";

        String[] arr = sample.split("");

        while (true){
            String word = words[number];
            System.out.println("enter you word");
            String guess = sc.nextLine();


            for (int i = 0; i < guess.length() ; i++) {
                if (guess.charAt(i) == word.charAt(i)){
                    arr[i] = String.valueOf(guess.charAt(i));
                }
            }
            String str = String.join(",", arr);
            str = str.replaceAll(",", "");
            System.out.println(str);
            if (guess.equals(word)){
                System.out.println("win");
                break;
            }

        }


    }
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
        guessWord();
    }
}
