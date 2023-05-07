package com.example.array;

public class Array10 {
    // 가변크기의 이차원배열이다.
    public static void main(String[] args) {
        int[][] koreanScoreArray = new int[2][];
        koreanScoreArray[0] = new int[2];
        koreanScoreArray[1] = new int[3];

        koreanScoreArray[0][0] = 0;
        koreanScoreArray[0][1] = 1;
        koreanScoreArray[1][0] = 2;
        koreanScoreArray[1][1] = 3;
        koreanScoreArray[1][2] = 4;

        for (int i = 0; i< koreanScoreArray.length; i++ ){
            for(int j = 0; j < koreanScoreArray[i].length; j ++){
                System.out.println(koreanScoreArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
