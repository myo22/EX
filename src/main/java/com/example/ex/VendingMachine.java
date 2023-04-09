package com.example.ex;

// static이 붙은 메소드는 클래스 메소드이다 -> 인스턴스를 생성하지 않아도 사용할 수 있습니다.
// 그렇다면 저 말은 뭐냐 사용가능 하다는건 메모리에 올라가 있다는걸 의미합니다.
public class VendingMachine {
    // field (가지는 것들 ex: 동전통, 상품 케이스)
    // 생성자
    // method (가지는 기능, 행위)
    public String pushProductButton(int menuID){
        System.out.println(menuID + "를 전달받았습니다.");
        return "콜라";
    }

    public static void printVersion(){ // static이 붙어서 인스턴스가 생성되지 않아도 사용이 가능하다.
        System.out.println("v1.0");
    }
}

// 객체지향의 핵심은 "메시징"이다. -> 어떤 객체가 다른 객체의 메소드를 호출하는 것을 메시징이라고 한다.
// 객체는 자율적인 책임을 가지고 있다. -> 객체의 기능이 호출되었을때 책임을 가진다.
// [접근제한자] [static] 리턴type 메소드이름([매개변수,....]) {실행문 ... }  []는 생략가능 *외우자*
// 메소드 이름은 소문자로 시작하는 것이 관례입니다. *중요*
// 메소드의 정의 부분에 나열되있는것이 매개변수(파라미터)이고 메소드를 실행할때 넣어주는 값이 전달 인자(아규먼트)이다.
// F7 = Step in, F8 = Step over 디버깅 단축기고 유용하다 *중요*

//메소드에 들어가는 값은 매개변수, 메소드에서 나오는 것은 리턴한다라고 표현한다.
//public 다음의 void는 리턴 하지 않겠다는 의미이다. -> 반환값 X