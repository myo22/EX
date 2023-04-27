package com.example.ex;

public class StringExam3 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        if (str1.equals(str2)){ // equals 메소드는 값이 같으냐를 물어보는것
            System.out.println("str1과 str2와 값이 같다.");
        }

        String s = str1.toUpperCase(); // 몽당 대문자로 바꿔서 리턴해줘라.
        System.out.println(s);
        System.out.println(str1); // 스트링은 불변객체이기 때문에 hello 그대로 나온다.

        String substring = str1.substring(3);
        System.out.println(substring);
        System.out.println(str1);

    }
}
