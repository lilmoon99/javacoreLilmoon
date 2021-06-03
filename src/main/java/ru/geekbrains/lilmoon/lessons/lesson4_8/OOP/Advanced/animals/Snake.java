package ru.geekbrains.lilmoon.lessons.lesson4_8.OOP.Advanced.animals;

public class Snake extends Animal{
    public Snake(String name, String color){
        super("Snake");
        this.name = name;
        this.color = color;
    }

    @Override
    public void voice(){
        System.out.printf("%s %s ssshhhhsshshshshs\n",TYPE,this.name);
    }
    @Override
    public void run(){
        System.out.printf("%s %s crawls on stomach\n",TYPE,this.name);
    }
    public void run(int length){
        System.out.printf("%s %s crawls for %d metres\n",TYPE,this.name,length);
    }
}
