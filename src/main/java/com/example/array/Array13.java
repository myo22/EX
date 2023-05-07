package com.example.array;

public class Array13 {
    public static void main(String[] args){
        ItemForArray[] array1 = new ItemForArray[3];
        array1[0] = new ItemForArray(500, "수박");
        array1[1] = new ItemForArray(200, "바나나");
        array1[2] = new ItemForArray(300, "김치");

        for(ItemForArray item : array1){
            System.out.println(item.getName());
            System.out.println(item.getPrice());
        }

    }
}
