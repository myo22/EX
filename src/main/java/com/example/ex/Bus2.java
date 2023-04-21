package com.example.ex;

public class Bus2 extends Car2{
    // 아무런 코드가 없으면 기본생성자가 만들어진다.
    public Bus2(){
        super("minhyung"); // 부모의 기본 생성자를 호출하는 코드가 자동으로 삽입된다.
        // 부모가 기본 생성자가 없다면 자식의 생성자에서 부모가 가진 생성자를 직접 호출하는 코드를 작성해야한다.
        System.out.println("Bus2 기본 생성자");
    }
}

// 문자열 클래스가 대표적인 불변객체이다. -> 스트링이 갖고있는 모든 메소드는 스트링 내부의 값을 변화시키지 않는다.