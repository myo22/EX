package com.example.ex;

public class LabelExam {
    public static void main(String[] args){
        outter:
        for (int i = 0; i < 3; i++){
            for (int k = 0; k < 3; k++){
                if (i == 0 && k ==2)
//                    break outter; //중첩된 반복문을 한번에 빠져나가고 싶을때 이것을 사용한다.
                    continue outter; //0과 2일때만 아랫줄이 실행되지 않는 것이다.
                System.out.println(i + ", " + k);
            }
        }
    }
}

