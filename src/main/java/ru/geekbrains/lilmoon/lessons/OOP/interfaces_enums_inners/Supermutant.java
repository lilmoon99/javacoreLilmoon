package ru.geekbrains.lilmoon.lessons.OOP.interfaces_enums_inners;

    public class Supermutant implements Moving,Attacking{
        private String name;
        public Supermutant (String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public void move() {
            System.out.printf("Supermutant %s walking on tentacles\n",this.name);
        }

        @Override
        public void move(int length) {
            System.out.printf("Supermutant %s walk for %d meters\n",this.name,length);
        }
        @Override
        public  void attack(){
            System.out.printf("Supermutant %s bites by his teeth\n",this.name);
        }
    }
