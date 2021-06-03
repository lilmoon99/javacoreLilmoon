package ru.geekbrains.lilmoon.lessons.lesson4_8.OOP.interfaces_enums_inners.HW;

public class Wall implements Trap {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    public boolean overcome(Participant participant){
        if (participant.jump(this.height)){
            System.out.printf("%s %s jumped over wall of %d meters!\n",participant.getClass().getSimpleName(),participant.getName(),this.height);
            return true;
        }
        else {
            System.out.printf("%s %s haven't jumped over wall of %dm.\n", participant.getClass().getSimpleName(), participant.getName(), height);
            return false;
        }
    }
}
