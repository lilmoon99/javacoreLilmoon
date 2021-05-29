package ru.geekbrains.lilmoon.lessons.OOP.Strings_OOP;

import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s1 = "Example";
//        String s2 = "Hello";
//        String s3 = "Hel";
//        String s4 = "lo";
//        String s5 = (s3+s4).intern();
//        String s6 = new String("Hello");
//        String s7 = new String(new char[]{'H','e','l','l','o'}).intern();
//        String s8 = new String(new byte[]{26,42,72,56,48});
//        String s9 = new String(s7);
//        String s10 = scanner.next();
//long delta= System.currentTimeMillis();
//        for (int i = 0; i < 100_000; i++) {
//            s1+=i;
//        }
//        long time = System.currentTimeMillis() - delta;
//        System.out.println("Time in first method is "+time);
//        StringBuilder stringBuilder = new StringBuilder("Example");
//        delta = System.currentTimeMillis();
//        for (int i = 0; i < 100_000; i++) {
//            stringBuilder.append(i);
//        }
//        time = System.currentTimeMillis() - delta;
//        System.out.println("Time in second method is  "+ time);
//        System.out.println(s1.equals(stringBuilder.toString()));
        Cat [] cat ={new Cat("Murzik",5),
                    new Cat("Barsik",10),
                    new Cat("Tishka",25),
                    new Cat("Garfield",30)};
        Bowl bowl = new Bowl();
        bowl.putFood(50);
        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i]);//это для наглядности
            cat[i].eat(bowl);
            cat[i].satietyCheck();
            //можно было форич'ем, но он не фурычел. Разобрался, но лень переделывать.
        }
    }
}
