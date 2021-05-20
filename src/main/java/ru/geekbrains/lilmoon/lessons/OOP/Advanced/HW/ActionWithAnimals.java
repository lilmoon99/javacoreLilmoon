package ru.geekbrains.lilmoon.lessons.OOP.Advanced.HW;

public class ActionWithAnimals {
    public static void main(String[] args) {
//        Dog dogBarbos = new Dog("Barbos");
//        Cat catMurzik = new Cat("Murzik");
//
//        dogBarbos.run(600);
//        dogBarbos.swim(4);
//
//        catMurzik.run(150);
//        catMurzik.swim(1);
        int catCounter = 0;
        int dogCounter = 0;
        int animalCounter =0;
        Animals[] animals = {
                new Dog("Barbos"),
                new Dog("Sharik"),
                new Dog("Mukhtar"),
                new Cat("Khajiit"),
                new Cat("Murzik")
        };
        for (Animals animal:animals) {
            animal.run(99);
            animal.swim(5);
            System.out.println();
        }
        for (Animals animal: animals) {
            if(animal instanceof Cat){
                catCounter++;
            }
            else if(animal instanceof Dog){
                dogCounter++;
            }
        }
        animalCounter=catCounter+dogCounter;
        System.out.printf("Number of cats: %d.\nNumber of dogs: %d.\nNumber of all animals:%d.",catCounter,dogCounter,animalCounter);
    }
}
