package ru.geekbrains.lilmoon.lessons.OOP.interfaces_enums_inners.HW;

public class OlympicGames {
    public static void main(String[] args) {
        Participant [] participants = {
                new Cat("Murzik",300,4),
                new Robot("Arduino Robot",400,4),
                new Human("Obama",6000,5)
        };
        Trap [] traps = {
                new Racetrack(290),
                new Wall(3),
                new Racetrack(200),
                new Wall(1)
        };
        for (Participant OGP:participants) {
            for (Trap trap:traps) {
                if(!trap.overcome(OGP))
                    break;
            }
            
        }
    }
}
