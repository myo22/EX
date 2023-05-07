package com.example.array;

public class Array12 {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("---------");

        // 위에 코드와 같은 코드이다. array 배열로부터 하나씩 꺼내라 -> 꺼낼게 없을때까지
        for (int i : array){
            System.out.println(i);
        }
    }
}
