package ru.geekbrains.lilmoon.lessons.lesson4_8.OOP.interfaces_enums_inners;

public class Classwork {
    public static void main(String[] args) {
//        eNums();
//        interfaceExample();
            Car car = new Car("Priora");
        System.out.println(car);
        Car.Engine engine1 = car.new Engine(100);
        Car.Engine engine2 = new Car("Nissan").new Engine(200);
    }

    private static void interfaceExample() {
        Moving[] units = {
          new Duck("Krya"),
          new Tank("T-34"),
          new Supermutant("vision"),
          new Tank("Abraham")
        };
        for (Moving unit:units) {
            unit.move();
            unit.move(500);
            unit.doDefault();
            if (unit instanceof Attacking) ((Attacking) unit).attack();
        }
    }

    private static void eNums() {
        Weekday day = Weekday.THURSDAY;
        System.out.println(day);
//        System.out.println(day.ordinal());
        System.out.println(day.getDayNumber());
        System.out.println(day.getRussianName());
        day = Weekday.FRIDAY;
        System.out.println(day);
        System.out.println(day.getDayNumber());
        System.out.println(day.getRussianName());
    }
}
