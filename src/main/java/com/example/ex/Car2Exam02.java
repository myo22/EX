package com.example.ex;

// 추상 클래스는 인스턴스가 될 수 없다.
// 추상 클래스를 상속받는 자손이 인스턴스가 된다.
// public abstract class 클래스명{}
public class Car2Exam02 {
    public static void main(String[] args){
//        Car2 c = new Car2("minhyung");
        Bus2 b = new Bus2();
        b.run();

        SportsCar s1 = new SportsCar("sportsCar!!");
        s1.run();

//        Car2 c = .......; // new Car2()는 나올 수 없다. why? 추상클래스이기 때문, 어떤 인스턴스인지 따라 달라지는 것.
//        c.run(); // 어떤 결과가 나올까요?

        Car2[] array = new Car2[2]; // Car2를 두개 참조할 수 있는 배열을 선언
        array[0] = new Bus2();
        array[1] = new SportsCar("minhyung");
        for(Car2 c2 : array){ // array 배열에서 하나씩 꺼내서 c2를 참조하도록
            c2.run();
        }

        // 오브젝트의 배열 -> 모든 객체를 참조할 수 있는 배열
    }
}
