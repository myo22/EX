package com.example.lotto;

// 불변객체, 불변클래스 Why? 로또 번호를 섞는데 번호값이 바뀌면 그건 안되니까
public class Ball {
    private int number;
    public Ball(int number){
        this.number = number;
    }

    // 외부에서 숫자값을 알려주기 위해서
    public int getNumber() {
        return number;
    }


}
