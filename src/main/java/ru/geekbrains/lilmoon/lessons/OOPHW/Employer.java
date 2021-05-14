package ru.geekbrains.lilmoon.lessons.OOPHW;

public class Employer {
    public final static String TYPE = "Employer";
    private final String FIO;
    private final String position;
    private final String email;
    private final String phoneNumber;
    private final int salary;
    private int age;

    public Employer(String FIO,String position,String email,String phoneNumber,int salary,int age){
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
public String toString(){
        return String.format("ФИО: %s\n Должность: %s\n Электронная почта: %s\n Телефонный номер: %s\n Зарплата: %d\n Возраст: %d\n",this.FIO,this.position,this.email,this.phoneNumber,this.salary,this.age);
}

        public int getAge() {
            return age;
        }
    }
