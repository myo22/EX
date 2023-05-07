package com.example.array;

public class Array01 {
    public static void main(String[] args){
        // 참조타입
        // 같은 타입의 변수가 여러개 필요할 때 사용한다.

        // 배열은 기본형 배열과 참조형 배열로 나뉜다.
        // 기본형 배열: boolean, byte, short, char, int ,long, float, double 타입의 변수를 여러개 선언할 필요가 있을때 사용.

        int[] array1;
        int array2[];
        int array3[];

        array1 = new int[5];
        array2 = new int[5];
        array3 = new int[0];

        System.out.println(array1.length);
        System.out.println(array2.length);
        System.out.println(array3.length);
    }
}
