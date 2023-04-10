package com.example.ex;

public class MyMathTest {
    public static void main(String[] args){
        int value = MyMath.abs(-5);
        System.out.println(value);

        // MyMath m = new MyMath(); // 자동으로 생성자가 만들어지기 때문에 오류가 나지 않는 것이다. 지금 생성자를 private하다는 것은 인스턴스 생성을 못하게 한다는 것이다. 그래서 지금 오류가 나는것
    }
}

// 고로 Math클래스를 만든 사람은 여러 개 인스턴스를 생성하지 못하게 함으로써 메모리를 절약할 수 있도록 하고 쉽게 호출하도록 만든 것이다.
