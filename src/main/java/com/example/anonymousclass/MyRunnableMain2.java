package com.example.anonymousclass;

public class MyRunnableMain2 {
    public static void main(String[] args){


        RunnableExecute runnableExecute = new RunnableExecute();
        System.out.println("----------------");
        runnableExecute.execute(() -> {
                System.out.println("Hello!!");

        });
        // 왜 이렇게 복잡하게 구현하나요?
        // 이유는 MyRunnable을 사용하는 객체를 재사용할 일이 없다고 판단한 것이다.
        System.out.println("----------------");
    }
}
