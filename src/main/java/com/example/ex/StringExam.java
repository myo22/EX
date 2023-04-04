package com.example.ex;

public class StringExam {
    public static void main(String[] args) {
        String s1 = "Hello" + 1;
        String s2 = "Hello" + true;
        String s3 = "Hello" + 50.4;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
} //문자열과 실수, 정수, 불리언등 더해도 문자열이 나온다.
