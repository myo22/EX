package com.example.array;

public class Array04 {
    // 참조형 배열
    public static void main(String[] args){
        ItemForArray[] array1;
        ItemForArray array2[];

        array1 = new ItemForArray[5]; // 아직은 배열만 만들어지는것이다.
        array2 = new ItemForArray[5];

        array1[0] = new ItemForArray(500, "item01"); // 인스턴스가 만들어지면서 참조하게 되는 것이다.

        System.out.println(array1[0].getName());
        System.out.println(array1[1].getName()); // nullpointException은 말그대로 참조하는 값이 비어있는 것이다.

    }
}
