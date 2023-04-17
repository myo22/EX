package com.example.ex;
// 버스는 자동차의 한 종류이다.
public class Bus extends Car{
    public void Run(){ // 똑같은 형태로 메소드를 선언해야 오버리이딩이 된다.
        System.out.println("후륜구동으로 달린다.");
    }
    public void 안내방송(){
        System.out.println("안내방송하다.");
    }
}
