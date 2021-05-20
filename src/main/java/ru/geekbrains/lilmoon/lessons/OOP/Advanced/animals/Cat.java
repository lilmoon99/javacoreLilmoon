package ru.geekbrains.lilmoon.lessons.OOP.Advanced.animals;

public class Cat extends Animal {
    private static final String TYPE = "Cat";

    public Cat(String name, String color) {
        super("Cat");
        this.name = name;
        this.color = color;
    }

    @Override
    public void voice (){
        System.out.printf("%s %s meow\n",TYPE,this.name);
    }
    public void run(int length){
        System.out.printf("%s %s ran for %d metres\n",TYPE,this.name,length);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        System.out.printf("%s with color %s will be colored in %s",this.name,this.color,color);
        this.color = color;
    }

}
