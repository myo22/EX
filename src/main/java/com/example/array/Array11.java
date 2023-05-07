package com.example.array;

public class Array11 {
    public static void main(String[] args) {
        int[][] koreanScoreArray = {{0,1}, {2,3,4}};

        for (int i = 0; i< koreanScoreArray.length; i++ ){
            for(int j = 0; j < koreanScoreArray[i].length; j ++){
                System.out.println(koreanScoreArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
