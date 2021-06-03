package ru.geekbrains.lilmoon.lessons.lesson4_8.OOP.Advanced;

import ru.geekbrains.lilmoon.lessons.lesson4_8.OOP.Advanced.animals.*;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Barsik", "black"),
                new Dog("Tuzik", "brown"),
                new Bird("Chizhik", "yellow"),
                new Snake("Kaa", "greenish-grey"),
                new Parrot("Kesha", "blue")
        };
        for (Animal animal : animals) {
            animal.run();
            animal.voice();
            if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }
            if (animal instanceof Parrot) {
                ((Parrot) animal).speak();
            }
//        cat.run();
//        cat.run(100);
//        cat.voice();
//
//        dog.run();
//        dog.run(250);
//        dog.voice();
//
//        bird.run();
//        bird.run(50);
//        bird.voice();
//
//        snake.run();
//        snake.run(10);
//        snake.voice();
        }
    }
}
