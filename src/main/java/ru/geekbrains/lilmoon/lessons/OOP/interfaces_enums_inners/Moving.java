package ru.geekbrains.lilmoon.lessons.OOP.interfaces_enums_inners;

public interface Moving {
    String action = "Move";
    void move();
    void move(int length);

    default void doDefault(){
        System.out.println("Default action");
    }
}
