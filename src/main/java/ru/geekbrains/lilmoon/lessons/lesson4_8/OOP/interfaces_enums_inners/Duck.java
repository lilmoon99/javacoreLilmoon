package ru.geekbrains.lilmoon.lessons.lesson4_8.OOP.interfaces_enums_inners;

public class Duck implements Moving{
    private String name;
    public Duck (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.printf("Duck %s flying\n",this.name);
    }

    @Override
    public void move(int length) {
        System.out.printf("Duck %s flew for %d meters\n",this.name,length);
    }
}
