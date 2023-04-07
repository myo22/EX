package com.example.ex;

public class MathBean {
    public void printClassName(){
        System.out.println("MathBean");
    }

    public void printNumber(int number){ //변수명은 중요하지 않지만 이해하기 쉽게 한다.
        System.out.println(number);
    }

    public int getOne(){
        return 1;
    }

    public int plus(int x, int y){
        return x + y;
    }


}
