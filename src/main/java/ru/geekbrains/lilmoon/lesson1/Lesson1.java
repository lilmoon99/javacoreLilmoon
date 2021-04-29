package ru.geekbrains.lilmoon.lesson1;//задание 1

public class Lesson1 {
    public static void main(String[] args) {
        //задание 2
        byte byteVar=127;
        short shortVar=12442;
        int intVar=500_000;
        long longVar=500_555_323_234L;
        float floatVar=2.2141245f;//одинарная точность
        double doubleVar=2.2223;//двойная точность
        char charVar1='Z';
        char charVar2='\u2242';//unicode symbol
        boolean booleanVar= true;
        //Чтобы проверить задание нужно подставить свои значения.
        System.out.println(task3(2.3f,5.1f,6.9f,1.6f));//задание 3
        System.out.println(task4(14,6));//задание 4
        task5(119);//задание 5
        System.out.println(task6(-2));//задание 6
        tasks7("Айнур");//задание 7
        task8(2021);//задание 8
        System.out.println("Good bye");
    }
    static float task3(float a,float b,float c,float d) {
        return a*(b+(c/d));
    }
    static boolean task4(int a, int b){
        int c=a+b;
        return c > 10 && c < 20;
    }
    static void task5(int a){
        if(a>=0)
            System.out.println("Ваше число положительное.");

        else
            System.out.println("Ваше число отрицательное.");

    }
    static boolean task6(int a){
        return a < 0;
    }
    static void tasks7(String name){
        System.out.println("Привет, "+name+"!");
    }
    static void task8(int year){
        if(year % 4 == 0||year%400==0){
            System.out.println(year+" високосный год");
        }
        else{
            System.out.println(year+" не является високосным годом");
        }
    }
}
