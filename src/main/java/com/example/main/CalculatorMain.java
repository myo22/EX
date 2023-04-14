package com.example.main;

import com.example.ex.Calculator; // 김철수란 학생이 1반과 3반에 있을때 어떤 김철수인지 -> JVM에게 어떤 패키지의 Calculator을 사용할 것 인지 알려주는 것이다.
                                  // 메모리에 올리는건 절때 아니다 알려주는 역할만 수행한다.

//import com.example.ex2.Calculator; // 이렇듯 이름이 같은 클래스를 모두 import하고 사용하려 하면 클래스 이름만 가지고는  어떤 패키지의 클래스인지 알 수 없다.
public class CalculatorMain {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        int value = cal.plus(50, 100);
        System.out.println(value);

        com.example.ex2.Calculator cal2 = new com.example.ex2.Calculator(); // 하나는 import해서 사용하고 또 다른 하나는 패키지명까지 붙여서 사용해야 한다.
        int value2 = cal2.divide(100, 200);
        System.out.println(value2);
    }
}
