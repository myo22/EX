package com.example.main;

import com.example.ex.Calculator; // 김철수란 학생이 1반과 3반에 있을때 어떤 김철수인지 -> JVM에게 어떤 패키지의 Calculator을 사용할 것 인지 알려주는 것이다.
                                  // 메모리에 올리는건 절때 아니다 알려주는 역할만 수행한다.

public class CalculatorMain {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        int value = cal.plus(50, 100);
        System.out.println(value);
    }
}
