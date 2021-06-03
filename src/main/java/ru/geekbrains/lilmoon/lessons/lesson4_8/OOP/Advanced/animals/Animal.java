package ru.geekbrains.lilmoon.lessons.lesson4_8.OOP.Advanced.animals;

public abstract class Animal {
     String TYPE;
    protected String name;
    protected String color;

    public Animal (String TYPE){
        this.TYPE = TYPE;
    }

    public abstract void voice();
    public void run(){
        System.out.printf("%s %s is walking on paws\n",TYPE,this.name);
    }
}
