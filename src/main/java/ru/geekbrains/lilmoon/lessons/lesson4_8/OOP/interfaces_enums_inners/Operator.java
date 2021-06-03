package ru.geekbrains.lilmoon.lessons.lesson4_8.OOP.interfaces_enums_inners;

public enum Operator {
    SUM{
        public int operation( int x,int y) {return x+y; }
    },
    MUL{
        public int operation(int x,int y) {return x*y; }
    };
    public abstract int operation( int x,int y);
}
