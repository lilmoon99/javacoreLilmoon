package ru.geekbrains.lilmoon.lessons.OOPHW;

public class Main {
    public static void main(String[] args) {
//        Emlpoyer emlpoyer = new Emlpoyer("Иванов Иван Иванович","Генеральный директор","ivanov.ivan@mail.ru","89273219871",80000,41);
//        System.out.println(emlpoyer);
        Employer [] employersArray = new Employer[5];
        employersArray[0]= new Employer("Иванов Иван Иванович","Генеральный директор","ivanov.ivan@mail.ru","89273219871",180000,41);
        employersArray[1]= new Employer("Максимов Максим Максимович","Менеджер по подбору персонала","HRMng@gmail.com","890229418309", 23000,27);
        employersArray[2]= new Employer("Александрова Александра Александровна","Уборщица","cleaningCompany228@inbox.ru","88005535352",14500,46);
        employersArray[3]= new Employer("Петров Пётр Петрович","Программист","backend@hack.ru","89999999999",80000,24);
        employersArray[4]= new Employer("Сидоров Леонард Сидорович","Менеджер по продажам","marketingGod@yandex.ru","88002525252",35000,21);
        for (int i = 0 ; i < employersArray.length; i++) {
        if(employersArray[i].getAge()>40){
            System.out.println(employersArray[i]);
        }
        }

    }

}

