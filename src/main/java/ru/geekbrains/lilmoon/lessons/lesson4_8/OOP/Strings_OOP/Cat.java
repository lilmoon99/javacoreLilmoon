package ru.geekbrains.lilmoon.lessons.lesson4_8.OOP.Strings_OOP;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety=false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Bowl bowl){
        if(bowl.getFoodAmount()>appetite) {
            System.out.printf("%s ate for some food\n", this.name);
            bowl.decreaseFood(appetite);
            satiety = true;
        }
        else if (bowl.getFoodAmount()<appetite){
            System.out.printf("%s can't satisfy his need with this amount of food\n",this.name);
        }
    }
    public void satietyCheck(){
        if (satiety==true){
            System.out.printf("%s is full\n",this.name);
        }
        else {
            System.out.printf("%s is hungry\n",this.name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}
