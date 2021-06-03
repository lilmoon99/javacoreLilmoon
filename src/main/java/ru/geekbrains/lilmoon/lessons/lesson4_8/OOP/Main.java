package ru.geekbrains.lilmoon.lessons.lesson4_8.OOP;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik","red",2,"Sphinx");
//        cat.name = "Barsik";
//        cat.color = "red";
//        cat.age = 2;
//        cat.breed = "Sphinx";
        System.out.println(cat);
        cat.setColor("blue");
        System.out.println(cat);
        cat.run();
        cat.voice();
        cat.run(10);

//        Cat cat1 = new Cat("Murzik","black",3,"Scotch");
//        cat1.name = "Murzik";
//        cat1.color = "black";
//        cat1.age = 3;
//        cat1.breed = "Scotch";
//        System.out.printf("Cat %s, color %s,age %d, breed %s\n",cat1.name,cat1.color,cat1.age,cat1.breed);
//        cat1.run();
//        cat1.voice();
    }
}
