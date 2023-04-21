package com.example.ex;

public class Car {
    private String name; // 필드는 가지는 것.

    // 생성자는 메소드와 비슷하다.
    // return type이 없다. 클래스이름과 같아야 한다
    // 매게변수 0개인 생성자를 기본생성자라고 한다.
    // 생성자가 하나도 없으면 아무일도 안하는 기본 생성자가 자동으로 만들어진다.
    // 생성자는 인스턴스를 생성할 때 생성된다.(금수저, 은수저같은 느낌)

    public Car(){
        System.out.println("자동차 한대가 생성됩니다.");
    }

    // 어떤 값을 가지고 인스턴스가 만들어지게 하고 싶다면 생성자를 사욯한다.
    // 이름을 가지고 인스턴스가 만들어지게 하고 싶다.
    public Car(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("자동차 이름: " + name);
    }

    public void Run(){
        System.out.println("전륜구동으로 달리다");
    }

    //Object가 오버라이딩하라고 제공하는 메소드이다.
    @Override
    public String toString() {
        return "자동차!!";
    }
}

