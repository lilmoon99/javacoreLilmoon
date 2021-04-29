package ru.geekbrains.lilmoon.lessons;

import java.util.Arrays;
import java.util.Random;

public class Lesson2 {
    public static void main(String[] args) {
//        int a=10;
//    String result;
//    if (a<0) result = "negative";
//    else result = "positive";
//    String result = a<0? "negative" : "positive";
//   System.out.println(result);

//        int a = 3;
//        if (a == 1) {
//            System.out.println("a = 1");
//        } else if (a == 3) {
//            System.out.println("a = 3");
//        } else {
//            System.out.println("Ни одно из условий не сработало");
//        }
//        int a = 3;
//        switch (a) {
//            case 1:
//                System.out.println("a = 1");
//                break;
//            case 3:
//                System.out.println("a = 3");
//                break;
//            default:
//                System.out.println("Ни один из case не сработал");
//        }
//        int count=0;
//        while(count<100){
//            count++;
//            if(count%2==0) continue;
//            System.out.println(count);
//            }
//        do{
//            System.out.println(count--);
//        }
//        while (count>0);
//        for (int count=0;count<=10;count++){
//            if (count%3==0) continue;
//            System.out.println(count);
//            if (count==6) break;
//        }
//            int [] arr= new int[10];
//        int arr[]=new int[5];
////        int[] arr= {10,2,14,5,6};
//        arr[0] = 10;
//        arr[1] = 2;
//        arr[2] = 14;
//        arr[3] = 5;
//        arr[4] = 6;
//        for(int i:arr){
//            System.out.println(i);
//        }
//        int sum=0;
//        for (int i:arr) {
//            sum+=i;
//        }
//        System.out.println(sum);
        //2,25hour


        invertArray();//задание 1
        fillArray();//задание 2
        changeArray();//задание 3
        fillDiagonal();
        maxMin();
    }


    public static int generateRandomInt(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }

    public static void invertArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateRandomInt(2);//генерируется массив случайных чисел от 0 до 1.
            System.out.print(array[i]);
        }
        System.out.println("\nПосле изменения:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) array[i] = 0;
            else array[i] = 1;
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) continue;
            arr[i] = arr[i - 1] + 3;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) w[i] *= 2;
        }
        for (int i : w) {
            System.out.print(i+" ");
        }
        System.out.println();

    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i]=1;
            arr[i][arr.length-1-i]=1;
            System.out.println(Arrays.toString(arr[i]));
        }

    }

    public static void maxMin(){
        int [] randomArray = new int[10];
        for(int i=0;i<randomArray.length;i++){
            randomArray[i]=generateRandomInt(100);
        }
        System.out.println(Arrays.toString(randomArray));
        int max = randomArray[0],min=randomArray[0];
        for (int j : randomArray) {
            if (j > max) max = j;
            else if (j < min) min = j;
//            for(int i=0;i<randomArray.length;i++){
//                if (randomArray[i]>max) max=randomArray[i];
//                else if(randomArray[i]<min) min=randomArray[i];
        }
        System.out.println("maximum:"+max);
        System.out.println("minimum:"+min);
    }
}
