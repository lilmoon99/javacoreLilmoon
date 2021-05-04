package ru.geekbrains.lilmoon.lessons.lesson2;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        int[][] arr2d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] arr1d = {1, 2, 10, 4, 5};
//        print1dArray(arr1d);
//        String[] strings = {"IphoneX", "car", "piecedorrball", "world", "lovely"};
//        Arrays.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        });
//        System.out.println(Arrays.toString(strings));
//        Arrays.sort(arr1d);
//        System.out.println(Arrays.toString(arr1d));
//        System.out.println(Arrays.binarySearch(arr1d,10));
//        int [] temp= Arrays.copyOf(arr1d,10);
//        System.out.println(Arrays.toString(temp));
//        Random random= new Random();
//
//        System.out.print("Please, enter name to great>>>");
//        String name=scanner.nextLine();
//        System.out.println("Hello, "+name);
//        System.out.println(getNumber());
//        String someName= "Aynur";
//        int someInt= 22;
//        double someDouble=1.5;
//        char someChar='M';
//        String s= String.format("Hello, %s. You're %d years old. \nYou have %f of something. Your char is %c",someName,someInt,someDouble,someChar);
//        System.out.println(s);
    }


//        static void print1dArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

//    }
    static Scanner scanner = new Scanner(System.in);
    static int getNumber(){
        int x;
        do {

            System.out.print("Please enter a number between 0 and 30>>>");
            x = scanner.nextInt();
        }
        while (x<0||x>30);
        return x;
    }


}