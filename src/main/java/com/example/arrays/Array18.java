package com.example.arrays;

import java.util.Arrays;

public class Array18 {
    public static void main(String[] args){
        int[] array = {5,4,3,1,2};

        Arrays.sort(array); // array 자체가 정렬되는 것이다. 리턴값 X

        // 1 ~ 100에서 x 라는 숫자를 생각하자
        // 20 - 그것보다 크다
        // 60? - 그것보단 작아
        // 1 ~ 100에서 가운데 숫자 50을 찾고 작다하면 25, 크다하면 75를 말해가는 중간값을 검색하는게 binarySearch이다.
        int i = Arrays.binarySearch(array, 4);
        System.out.println(i);


    }
}
