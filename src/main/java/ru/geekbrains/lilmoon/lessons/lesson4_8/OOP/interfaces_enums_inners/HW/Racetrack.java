package ru.geekbrains.lilmoon.lessons.lesson4_8.OOP.interfaces_enums_inners.HW;

public class Racetrack implements Trap{
    private int length;

    public Racetrack(int lenght) {
        this.length = lenght;
    }

    public boolean overcome(Participant participant) {
        if (participant.run(this.length)) {
            System.out.printf("%s %s ran track of %dm.\n", participant.getClass().getSimpleName(), participant.getName(), length);
            return true;
        }
        System.out.printf("%s %s haven't ran track of %dm.\n", participant.getClass().getSimpleName(), participant.getName(), length);
        return false;
    }
}
