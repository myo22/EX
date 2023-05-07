package com.example.array;

import java.util.Arrays;

public class Array15 {
    public static void main(String[] args){
        char[] copyForm = {'h', 'e', 'l', 'l', 'o', '!'};
        char[] copyTo = Arrays.copyOfRange(copyForm, 1, 3);
        for( char a : copyTo){
            System.out.println(a);
        }
    }
}
