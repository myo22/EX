package com.example.ex;

public class Hello2 {
    static int i;
    static {
        i = 500;
        System.out.println("static block"); // 원래는 static field를 초기화한다.
    }
    public static void main(String[] args){
        System.out.println("Hello");
    }
}
// **중요**
// javac Hello2.java
// java Hello2
// 순서: JVM이 CLASSPATH에서 Hello2를 찾아서 읽어들이면서 정보를 메모리에 올린다 -> 읽어들일때 클래스 필드(static필드)나 클래스 메소드(static메소드)가 있다면 사용 가능하도록 메모리에 올린다.
// static블록의 코드가 실행된다 -> JVM은 main메소드를 찾고 실행합니다(main 메소드도 static 하기때문에 인스턴스 만들지 않고 실행가능한 것)
