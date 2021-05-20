package ru.geekbrains.lilmoon.lessons.OOP;

import java.time.Year;

public class Cat {
    public final static String TYPE = "Cat";
    private String name;
    private String color;
    private int birthDate;
    private String breed;
    public Cat(){
        System.out.println("Cat born");
    }
    public Cat(String color,String breed){
        this();
        this.color = color;
        this.breed = breed;
    }
    public Cat(String name,String color,int age,String breed){
        this(color, breed);
        this.name = name;
        this.birthDate = Year.now().getValue() - age;

    }

    public void voice(){
        System.out.printf("%s %s meow!\n",TYPE,name);
    }
    public void run(){
        System.out.printf("%s %s is running\n",TYPE,name);
    }
    public void run(int lenght){
        System.out.printf("%s %s ran for %d metres",TYPE,this.name,lenght);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return Year.now().getValue()- birthDate;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        System.out.printf("%s with color %s will be colored in %s\n",this.name,this.color,color);
        this.color = color;
    }
    public String toString(){
        return String.format("Cat %s, color %s,age %d, breed %s\n",this.name,this.color,getAge(),this.breed);
    }

//    public String toString() {
//        return "Cat{" +
//                "name='" + name + '\'' +
//                ", color='" + color + '\'' +
//                ", age=" + age +
//                ", breed='" + breed + '\'' +
//                '}';
//    }
}
