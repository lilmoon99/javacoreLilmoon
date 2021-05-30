package ru.geekbrains.lilmoon.lessons.OOP.interfaces_enums_inners;

public class Car {
    private String title;
    private Engine engine;

    public Car(String title) {
        this.title = title;
    }

    class Engine{
        private int power;

        public Engine(int power) {
            this.power = power;
        }

        public int getPower() {
            return power;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "title='" + title + '\'' +
                ", engine=" + engine +
                '}';
    }
}
