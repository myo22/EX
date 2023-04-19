package com.example.ex;

public class Exam01 { // 정보은닉(= 신호등)이라는 개념이 있는데 객체 지향에서는 필드를 직접 접근하는 것은 안좋다(접근 지정자를 이용) ex) Exam01에서 i에 직접 접근
    public static void main(String[] args){

        Parent p1 = new Parent();
        System.out.println(p1.i);
        p1.printI();
        System.out.println("------------------");
        Child c1 = new Child();
        System.out.println(c1.i);
        c1.printI();
        System.out.println("------------------");
        Parent p2 = new Child(); // 오류가 안난다는건 Child는 Parent의 후손이다. 혹은 자식이다.
        System.out.println(p2.i); // 필드는 부모 타입을 따라간다.
        p2.printII(); // 왜냐면 필드가 오버라이딩 되서 자식의 값이 사용된다면 부모 클래스를 만든 사람이 예상하지 못한 값의 결과가 출력될 것이기 때문이다.
        p2.printI(); // 메소드는 오버라이딩되면 무조건 자식의 메소드가 실행됩니다.
    }
}
