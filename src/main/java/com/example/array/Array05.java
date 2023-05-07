package com.example.array;

public class Array05 {
    public static void main(String[] args){
        ItemForArray[] array1 = new ItemForArray[3];
        array1[0] = new ItemForArray(500, "수박");
        array1[1] = new ItemForArray(200, "바나나");
        array1[2] = new ItemForArray(300, "김치");

        ItemForArray[] array2 = new ItemForArray[]{new ItemForArray(500, "수박"), new ItemForArray(200, "바나나"),new ItemForArray(300, "김치")};
        ItemForArray[] array3 = {new ItemForArray(500, "수박"), new ItemForArray(200, "바나나"),new ItemForArray(300, "김치")};

        System.out.println(array2[0].getName());
    }
}
