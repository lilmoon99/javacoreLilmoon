package ru.geekbrains.lilmoon.lessons.OOP.Advanced.HW;

public class Dog extends Animals{
    public Dog(String name){
        super("Dog");
        this.name = name;
    }
    int runLimit = 500;
    int swimLimit = 10;
    public void run(int length){
        if(length>runLimit){
            System.out.printf("%s %s ran for %d metres and fell down to ground.\n",TYPE,this.name,length);
        }
        else{
            System.out.printf("%s %s ran for %d metres.\n",TYPE,this.name,length);
        }
    }
    public void swim(int length){
        if (length>swimLimit){
            System.out.printf("%s %s swam for %d metres and died.\n",TYPE,this.name,length);
        }
        else {
            System.out.printf("%s %s swam for %d metres.\n",TYPE,this.name,length);
        }
    }
}
