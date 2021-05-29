package ru.geekbrains.lilmoon.lessons.OOP.Advanced.animals;

public class Dog extends Animal {
    private static final String TYPE = "Dog";

    public Dog(String name, String color) {
        super("Dog");
        this.name = name;
        this.color = color;
    }

    @Override
    public void voice (){
        System.out.printf("%s %s woof\n",TYPE,this.name);
    }

    public void run(int length){
        System.out.printf("%s %s ran for %d metres\n",TYPE,this.name,length);
    }

    
}
