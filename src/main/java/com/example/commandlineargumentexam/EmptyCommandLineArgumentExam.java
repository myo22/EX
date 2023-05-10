package com.example.commandlineargumentexam;

// 명령 행 아규먼트(Command-Line Arguments)
// main메소드에 있는 Sring[] args
// JVM이 main메소드를 실행할 때 String[]을 아규먼트로 넘겨 준다는 것을 의미한다.

public class EmptyCommandLineArgumentExam {
    public static void main(String[] args){
        System.out.println(args.length);
    }
}

// String[] args = new String[0];
// main(args);

// javac EmptyCommandLineArgumentExam.java
// java EmptyCommandLineArgumentExam a b c d hello <- 공백을 기준으로한 문자열이 args이다.
// java -javaagent:어떤설정 EmptyCommandLineArgumentExam a b c -> -javaagent:는 자바한테 주는 옵션, a b c는 아규먼트

