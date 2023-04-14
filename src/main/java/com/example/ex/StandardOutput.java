package com.example.ex;

// int를 출력하든 double을 출력하든 println 이름은 같다 -> 값이 뭐가 되든 출력하고 줄바꿈을 한다는 것이기 때문에 이름이 다를 필요가 없다.
// 즉 같은 이름의 메소드가 여러 개 있는데 매개 변수의 타입이 다르거나 매게변수의 개수가 다른 경우를 오버로딩이라고 한다.
// 예를들어 printIntln() printStringln()처럼 어떤 타입을 출력하느냐에 따라 다르면 사용자는 힘들어 질 것이다.
// 객체를 사용할 때 편리한게 좋기 때문에 다형성이 중요한 것이다.

public class StandardOutput {
    public void println(boolean b){
        System.out.println(b);
    }

    public void println(int i){
        System.out.println(i);
    }

    public void println(double d){
        System.out.println(d);
    }

    public void println(String s){
        System.out.println(s);
    }
    // 이와 같이 메소드 이름은 같지만 타입이 다른게 오버로딩 메소드이다.

    // java StandardOutput
    public static void main(String[] args){
        StandardOutput standardOutput = new StandardOutput();
        standardOutput.println(100);
        standardOutput.println("hello");
        standardOutput.println(10.5);
        standardOutput.println(false);

        // *객체를 만들 땐 나는 어렵게 만들어도, 사용하는 사람은 쉽게 쓸 수 있도록 만들어야 한다.*
    }
}
