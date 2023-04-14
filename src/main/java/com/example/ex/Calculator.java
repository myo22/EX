package com.example.ex;

// 자바는 패키지로 관련있는 클래스를 모아서 관리한다. ex) 폴더를 만들어서 관리하는것
// 패키지 이름 규칙은 도메인 이름을 거꾸로 적은 후에 프로젝트 이름 등을 붙여서 만들게 된다.
// 음악만 봐도 가수별로 모을건지 장르별로 모을건지는 폴더를 만드는 방식이 다 다를것이다. -> 그래서 규칙을 정한 것이다.
// 관련된 클래스는 어떤 기준인가?? 아키텍처(구조)따라 재료들이 틀리고 보관하는 장소도 달라져야 한다. -> 아키텍처를 정하는 사람은 아키텍트라고 한다.
// 자바 기본은 왜 패키지가 어렵나? -> 무슨 프로그램을 만들지도 모르고 암기과목처럼 외우기 때문이다
// .은 하위 폴더를 나타낸다. 패키지를 작성할 떄 도메인 이름을 거꾸로 적어준다 -> 거꾸로 적은 도메인 + 프로젝트 이름(모듈이름)
// Why?? 충돌이 안나기 위하여

public class Calculator {
    public int plus(int x, int y){
        return x + y;
    }

    public int minus(int x, int y){
        return x - y;
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int value = calculator.plus(10, 100);
        System.out.println(value);

        // 패키지가 정의된 클래스 컴파일 하기 : javac -d. Calculator.java
        // 실행할떄는 패키지 경로까지 전부 적어줘야한다 : java com.example.ex.Calculator
    }
}
