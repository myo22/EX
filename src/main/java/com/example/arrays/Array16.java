package com.example.arrays;

import java.util.Arrays;

public class Array16 {
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5};
//        int[] array2 = {1,2,3,4,5};
//        int[] array2 = {1,2,3,4,5,6};
        int[] array2 = {1,2,3,4,4};

        // 양수, 0 , 음수(비교할때는)
        // x - y = 결과가 양수가 나왔다면? x가 큰거다. 0은 같은것.
        int compare = Arrays.compare(array1, array2);
        System.out.println(compare);


    }
}
