package ru.geekbrains.java1.lesson2;

import java.util.Arrays;

public class Main {

    private static int[] shiftElements(int[] arr, int n){
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                int temp = arr[arr.length - 1];
                for (int j = arr.length - 2; j > -1; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[0] = temp;
            }
        }
        if (n < 0){
            n *=-1;
            for (int i = 0; i < n; i++) {
                int temp = arr[0];
                for (int j = 0; j < arr.length -1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
        }
        return arr;
    }

    private static boolean checkBalance(int[] arr){
        int sum = 0;
        boolean isBalance = false;
        for (int i = 0; i <  arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 == 0){
            isBalance = true;
        }
        return isBalance;

    }

    private static int findMax(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    private static int findMin(int[] arr){
        int min = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    private static int[] changeNumbers(){
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                arr[i] = 0;
            }else if (arr[i] == 0){
                arr[i] = 1;
            }
        }
        return arr;
    }

    private static int[] fillArray(){
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        return arr;
    }

    private static int[] lessThenSix(){
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < 6){
                arr[i] *= 2;
            }
        }
        return arr;
    }

    private static void fillDiagonalElements(){
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length ; i++) {
            arr[i][i] = 1;
            arr[arr.length - i - 1][i] = 1;
        }
    }

    public static void main(String[] args) {
       // System.out.println(Arrays.toString(changeNumbers()));
       // System.out.println(Arrays.toString(fillArray()));
     //   System.out.println(Arrays.toString(lessThenSix()));
    //    fillDiagonalElements();;

      //  System.out.println(findMin(new int[]{1, 5, 3, 2, 11, 4, -524, 5, 2, 4, 8, 9, 1, -152}));
      //  System.out.println(findMax(new int[]{1, 5, 3, 2, 11, 534, 4, -524, 5, 2, 4, 8, 9, 1, -152}));

        System.out.println(Arrays.toString(shiftElements(new int[]{1, 5, 3, 2, 11, 534, 4, -524, 5, 2, 4, 8, 9, 1, -152}, -3)));


    }
}
