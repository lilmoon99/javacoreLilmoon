package ru.geekbrains.lilmoon.lessons.lesson4_8.OOP.Advanced.HW;

public class Cat extends Animals {
        public static int counterCat=0;
        public Cat(String name){
            super("Cat");
            this.name = name;
            counter();
        }
        public void counter(){
            counterCat++;
        }
        int runLimit = 200;
        public void run(int length){
            if(length>runLimit){ System.out.printf("%s %s ran for %d metres and fell down to ground.\n",TYPE,this.name,length); }
            else{ System.out.printf("%s %s ran for %d metres.\n",TYPE,this.name,length);}
        }
        public void swim(int length){ System.out.printf("%s %s can't swim. He died :(\n",TYPE,this.name);}
}
