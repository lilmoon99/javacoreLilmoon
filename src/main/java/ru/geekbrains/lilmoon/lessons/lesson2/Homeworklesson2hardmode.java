package ru.geekbrains.lilmoon.lessons.lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homeworklesson2hardmode {
    public static void main(String[] args) {
//        guessTheWord();
        int [] arr={2,1,5,1,2,5};
//        checkBalance(arr);
        arrayMove(arr);
        }
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static void guessTheWord()
    {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String correctAnswer=words[random.nextInt(words.length)];
        char [] hint = new char[15];
        Arrays.fill(hint,'#');
        while(true){
            System.out.println(correctAnswer);
            System.out.println("Guess the word>>>");
            String userAnswer = scanner.next();
            if(userAnswer.toLowerCase().equals(correctAnswer)){
                System.out.println("You win");
                break;
            }
            for (int i = 0; i < userAnswer.length()&&i<correctAnswer.length(); i++) {
                if(userAnswer.charAt(i)==correctAnswer.charAt(i))
                    hint [i]=correctAnswer.charAt(i);
            }
            System.out.println("Wrong answer. Get a hint:");
            System.out.println(new String(hint));
    }

    }
    static boolean checkBalance(int []arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        if (sum%2!=0)  return false;
        sum/=2;
        int half=0;
        for (int i = 0; i < arr.length; i++) {
            half+=arr[i];
            if(half==sum) return true;
        }
        return false;
    }
    static void arrayMove(int [] arr){
        System.out.println("На сколько надо сдвинуть массив?");
        int n=scanner.nextInt();
        if( n>0){
            for (int j = 0; j <=n; j++) {

            int temp=arr[arr.length-1];
            for (int i = 0; i < arr.length; i++) {
            arr[arr.length-1-i]=arr[arr.length-2-i];
                }
            arr[0]=temp;
            }
        }
    }
}




