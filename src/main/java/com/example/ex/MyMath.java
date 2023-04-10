package com.example.ex;

public class MyMath {
    // 자동생성 - 기본생성자는 생성자가 없을 경우 컴파일할 때 자동으로 생성한다.
    private MyMath(){
        //생성자는 리턴타입없고 클래스와 이름이 같아야 한다.
        //private 해당 클래스 안에서만 접근 가능
    }

    public static int abs(int x){
        if(x < 0){
            return x * -1;
        }
        else
            return x;
    }
}
