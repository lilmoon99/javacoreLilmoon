package ru.geekbrains.lilmoon.lessons.OOP.Advanced.animals;

public class Bird extends Animal{

    public Bird(String name, String color) {
        super("Bird");
        this.name = name;
        this.color = color;
    }

    @Override
    public void voice (){
        System.out.printf("%s %s krya\n",TYPE,this.name);
    }
    public void run(int length){
        System.out.printf("%s %s ran for %d metres\n",TYPE,this.name,length);
    }

    public void fly(){
        System.out.printf("%s %s if flying\n",TYPE,this.name);
    }
}
