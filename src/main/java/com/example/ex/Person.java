package com.example.ex;

public class Person {
    String name; // 인스턴스 필드 (static이 붙어 있지 않음)
    String address;
    boolean isVip;
    static int count = 0; // 클래스 필드
    static{ // 클래스 필드는 static 블록에서 초기화할 수 있다.
        count = 100;
    }

    // 인스턴스 메소드
    public void printName(){ // 클래스에 있는 메소드들은 클래스에 있는 필드들을 파라미터를 제외하고 메소드 안에서 이용할 수 있다.
        System.out.println("내 이름은 "+ name);
    }

    // 클래스 메소드
    public static void printCount(){
        System.out.println("count : " + count);
//      System.out.println(name); //static한 메소드는에서는 인스턴스 필드나, 인스턴스 메소드를 사용할 수 없다.
//      *WHy? 클래스 메소드가 실행되는 시점에서는 인스턴스 필드가 메모리에 없으니까 컴파일 오류가 나는 것이다. 즉 클래스 메소드 안에서는 클래스 필드만 사용할 수 있다.

    }
}
