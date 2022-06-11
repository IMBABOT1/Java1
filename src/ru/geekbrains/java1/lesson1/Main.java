package ru.geekbrains.java1.lesson1;

public class Main {

    private static void isLeap(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("leap");
        } else {
            System.out.println("no leap");
        }
    }

    private static String hello(String name){
        return "Hello:" + " " + name;
    }

    private static boolean toNegative(int number){
        boolean result = false;
        if (number < 0){
            result = true;
        }
        return result;
    }

    private static void isPositive(int number){
        if (number >= 0){
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }
    }

    private static boolean checkSum(int first, int second){
        return first + second >= 10 && first + second <= 20;
    }

    private static int calculate(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    private static void initialize(){
        byte b = 1;
        short s = 2;
        int i = 4;
        long l = 8;

        float f = 1.0f;
        double d = 2.0;

        char c = 'c';
        boolean bool = true;
    }

    public static void main(String[] args) {
        isLeap(1612);
    }
}
