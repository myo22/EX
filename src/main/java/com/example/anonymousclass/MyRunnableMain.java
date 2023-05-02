package com.example.anonymousclass;

public class MyRunnableMain {
    public static void main(String[] args){

//      람다 표현식: 메소드를 한개 가지고 있다.
//        () -> {
//            System.out.println("Hello!!");
//
//        });   아래와 같은 것이다. 이렇게 간략화 시켜서 표현할 수 있다

        // 이름없는객체
        MyRunnable r = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("MyRunnable run!!");
            }
        };

        r.run();
    }
}
