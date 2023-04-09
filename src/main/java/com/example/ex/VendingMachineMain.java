package com.example.ex;

public class VendingMachineMain {
    public static void main(String[] args){ //String은 자바 개발자가 만든 클래스인데 여기서도 VendingMachineMain은 String클래스에 의존한다.
        VendingMachine vm1 = new VendingMachine(); //vm1은 참조변수 new VendingMachine();은 인스턴스 생성
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(100);
//        vm1.printVersion(); //static한 메소드는 레퍼런스변수명.static메소드()가 가능은 하다. 대신 적절하지는 않다. -> 프로그래머 간의 관례
        System.out.println(product);
//        VendingMachine.printVersion(); // static하기 때문에 가능한것이다.
        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);
    }
}
// 가장 좋은 예가있다 할아버지를 떠올리자 할아버지는 걷기();라는 행동을 하기 위해서는 지팡이가 필요하다 -> 한마디로 지팡이에 의존한다.
// VendingMachineMain은 VendingMachine을 의존한다. 메소드에서 사용하는건 의존한다.

// javac VendingMachine.java
// javac VendingMachineMain.java
// java VendingMachineMain

// VendingMachineMain은 어디서 찾아서 실행할까요? 즉 JVM은 클래스를 어디서 찾습니까?
// 틀린답) 현재 폴더에서 찾는다
// 정답) CLASSPATH경로에서 VendingMachineMain을 찾아서 실행한다. ClassPath=. 여기서 '.'은 현재경로다

// JVM이 클래스를 읽어들이면 PERM에 클래스 정보가 올라가게 된다. -> PERM에서 main 메소드를 찾아서 실행 -> JAVA Stack에 메소드 정보가 올라간다.(Stack Entry가 저장된 메소드 실행 정보 하나다 -> 메소드마다 스택 엔트리가 생긴다.)
// 종료하면 스택 엔트리가 자바 스택에서 사라진다
// 지역변수는 메소드가 실행될 때 생성되고 메소드가 종료되면 사라진다. 같은 메소드를 열번 호출한다면 그 메소드안의 지역 변수는 각각 다른 영역에서 저장되어 사용합니다. -> 동시에 메소드가 호출뒤어도 문제가 없다.