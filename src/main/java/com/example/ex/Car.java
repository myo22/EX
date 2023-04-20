package com.example.ex;

public class Car {
    public void Run(){
        System.out.println("전륜구동으로 달리다");
    }

    //Object가 오버라이딩하라고 제공하는 메소드
    @Override
    public String toString() {
        return "자동차!!";
    }
}
