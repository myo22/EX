package com.example.commandlineargumentexam;

public class CommandLineArgumentExam {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("사용법 : CommandLineArgumentExam 값 값 ....");
            System.exit(0); // 프로그램을 종료하라는뜻. return; 으로 변경 가능
        }

        for (String arg : args){
            System.out.println(arg);
        }
    }
}
/*

Hello.java 파일 작성하고
javac Hello.java - 이 명령도 마찬가지

명령을 실행했을 때 성공하면 아무런 메세지도 출력하지 않는다. -> Unix 철학.
Linux도 Unix의 계열이다.

작은 명령들을 조합해서 또 다른 명령을 만든다. (쉘 스크립트 작성)

작은 명령들이 실행되고 종료될때. 이게 성공? 실패? 궁금하다
내가 만든 프로그래밍 종료 코드를 리턴. 종료 코드를 가지고 이 프로그램과 프로그램들을 조합할때 사용된다.

 */