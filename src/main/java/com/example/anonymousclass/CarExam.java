package com.example.anonymousclass;

public class CarExam {
    public static void main(String[] args){
        // Car를 상속받고 싶은데 클래스는 만들고 싶지 않으면
        Car c1 = new Car(){
            @Override
            public void a() {
                System.out.println("이름없는 객체의 a()메소드 오버라이딩");
            }
        };
        c1.a();


        Car c2 = new Bus();
    }
}
