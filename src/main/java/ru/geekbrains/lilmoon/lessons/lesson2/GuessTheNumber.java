package ru.geekbrains.lilmoon.lessons.lesson2;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        while (true) {
            boolean guess = false;
            int numberAI = random.nextInt(10);
            int tries = 3;
            for (int i = 0; i < tries; i++) {
                System.out.println("Guess the number>>>");
                int answer = scanner.nextInt();
                if (answer == numberAI) {
                    System.out.println("Guessed.");
                    guess = true;
                    break;
                } else if (answer < numberAI) System.out.println("Your number is low.");
                else System.out.println("Your number is high.");
            }
            if (!guess) {
                System.out.println("LOOSER!");
                System.out.println("Number was: " + numberAI);
                System.out.print("Try again? Y/N>>>>");
                if (!scanner.next().toLowerCase().equals("y")) break;
            }
        }
    }
    }