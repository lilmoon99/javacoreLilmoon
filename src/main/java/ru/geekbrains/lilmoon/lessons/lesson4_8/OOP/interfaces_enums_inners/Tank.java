package ru.geekbrains.lilmoon.lessons.lesson4_8.OOP.interfaces_enums_inners;

    public class Tank implements Moving,Attacking{
        private String title;
        public Tank (String title){
            this.title = title;
        }

        public String getName() {
            return title;
        }

        @Override
        public void move() {
            System.out.printf("Tank %s rides on tracks\n",this.title);
        }

        @Override
        public void move(int length) {
            System.out.printf("Tank %s rides %d meters\n",this.title,length);
        }
        @Override
        public  void attack(){
            System.out.printf("Tank %s fires with bomb\n",this.title);
        }
    }
