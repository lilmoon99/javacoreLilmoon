package ru.geekbrains.lilmoon.lessons.OOP.Advanced.animals;

public class Parrot extends Bird {

    public Parrot(String name, String color) {
        super(name, color);
        this.TYPE = "Parrot";
    }
    @Override
    public void voice(){
        System.out.printf("%s %s chik cheereek!\n",TYPE,this.name);
    }
    public void speak(){
        System.out.printf("%s blah blah blah",this.name);
    }
}
