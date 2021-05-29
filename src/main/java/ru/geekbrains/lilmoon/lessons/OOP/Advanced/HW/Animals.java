package ru.geekbrains.lilmoon.lessons.OOP.Advanced.HW;

public abstract class Animals {
    String TYPE;
    protected String name;

    public Animals (String TYPE){
        this.TYPE = TYPE;
    }
    public abstract void run(int length);
    public abstract void swim(int length);


}
