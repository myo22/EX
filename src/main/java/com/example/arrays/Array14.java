package com.example.arrays;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args){
        int[] copyFrom = {1,2,3};

        // 새로운걸 3개짜리 배열을 만들어주고 복사하고 그것을 copyTo가 참조하는 것이다.
        int[] copyTo = Arrays.copyOf(copyFrom, copyFrom.length);
        if (copyTo == copyFrom){
            System.out.println("copyTo == copyFrom");
        }
        else {
            System.out.println("copyTo != copyFrom");
        }

        for(int c : copyTo){
            System.out.println(c);
        }

        System.out.println("----------------------");

        int[] copyTo2 = Arrays.copyOf(copyFrom, 5);
        // 배열 크기가 더 크다면 0값이 들어간다.

        for (int c : copyTo2){
            System.out.println(c);
        }

        System.out.println("----------------------");

        // 이러면 같은걸 참조하게 해버린다. 즉 copyFrom의 값이 바뀌면 copyTo3도 바뀐다.
        int[] copyTo3 = copyFrom;
        for (int c : copyTo3){
            System.out.println(c);
        }

        if (copyTo == copyFrom){
            System.out.println("copyTo == copyFrom");
        }
        else {
            System.out.println("copyTo != copyFrom");
        }
    }
}

// 깊은 복사(Deep Copy) vs 얕은 복사(Shallow Copy)
