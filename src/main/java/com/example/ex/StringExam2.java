package com.example.ex;

// String클래스가 대표적인 final 클래스이다.

public class StringExam2 {
    public static void main(String[] args){
        String str1 = "hello"; // new를 사용하지 않으면 같은 객체를 사용 -> 상수 (메로리를 적게 사용)
        String str2 = "hello";
        String str3 = new String("hello"); // new를 쓰면 메모리상에 다른 영역을 차지한다.
        String str4 = new String("hello");

        if (str1 == str2) // 레퍼런스타입에서 "=="이란 값이 같냐가 아니라 같은 것을 참조하냐 이다.
            System.out.println("str1 == str2");
        if (str1 == str3)
            System.out.println("str1 == str3");
        if (str3 == str4)
            System.out.println("str3 == str4");


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
}
