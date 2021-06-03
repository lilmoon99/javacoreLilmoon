package ru.geekbrains.lilmoon.lessons.lesson4_8.OOP.Advanced.HW;

public abstract class Animals {
    String TYPE;
    protected String name;

    public Animals (String TYPE){
        this.TYPE = TYPE;
    }
    public abstract void run(int length);
    public abstract void swim(int length);


}
