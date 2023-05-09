package com.example.array;

import java.util.Arrays;
// java.lang 패키지의 클래스는 import를 하지 않아도 사용가능하다.

public class Array15 {
    public static void main(String[] args){
        char[] copyForm = {'h', 'e', 'l', 'l', 'o', '!'};
        char[] copyTo = Arrays.copyOfRange(copyForm, 1, 4);
        for( char a : copyTo){
            System.out.println(a) ;
        }
    }
}
