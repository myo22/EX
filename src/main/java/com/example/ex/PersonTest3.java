package com.example.ex;

public class PersonTest3 {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "김춘복";

        p1.printName();
        Person.printCount();

        Person.count++;
        Person.printCount();

//        System.out.println(Person.count);
//        Person.printCount();
//
//        System.out.println(Person.name);  반드시 인스턴스 생성후 참조하는 변수를 이용해서 사용해야한다.
//        Person.printName();
    }
}
