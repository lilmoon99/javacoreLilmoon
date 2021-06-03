package ru.geekbrains.lilmoon.lessons.lesson9;


public class Exceptions {
    public static void main(String[] args) {
        String [][] myArray = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4",},
//                {"5", "5", "5", "5"}
        };
        try {
        arrrayIn(myArray);
        } catch (MyArraySizeException exeptionSize) {
            exeptionSize.printStackTrace();
            System.out.println("Попробуйте заново ввести размер массива!");
        } catch (MyArrayDataException exceptionData){
            exceptionData.printStackTrace();
            System.out.println("Введите массив состоящий из чисел!");
        }
    }
    private static void arrrayIn(String[][] arr){
        int arrayMaxSize = 4;
        int summary = 0;
        MyArraySizeException exceptionSize = new MyArraySizeException("Нужен массив 4*4!");
        MyArrayDataException exceptionData = new MyArrayDataException("Не удалось преобразовать в число!");
        if (arr.length != arrayMaxSize) throw exceptionSize;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length !=arrayMaxSize) throw exceptionSize;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int temp = 0;
                try {
                    temp = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException exception){
                    System.out.println("Элемент массива под индексом:["+ i + ";"+ j + "]"+ " невозможно преобразить в число!");
                    throw exceptionData;
                }
                summary += temp;
            }
        }
        System.out.println("Сумма всех членов массива:" + summary);
    }
}
    class MyArraySizeException extends RuntimeException{

        public MyArraySizeException(String message) {
            super(message);
        }
    }
    class MyArrayDataException extends RuntimeException{

        public MyArrayDataException(String message) {
            super(message);
        }
    }
