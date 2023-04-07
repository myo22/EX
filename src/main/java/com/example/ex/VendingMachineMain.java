package com.example.ex;

public class VendingMachineMain {
    public static void main(String[] args){ //String은 자바 개발자가 만든 클래스인데 여기서도 VendingMachineMain은 String클래스에 의존한다.
        VendingMachine vm1 = new VendingMachine(); //vm1은 참조변수 new VendingMachine();은 인스턴스 생성

        String product = vm1.pushProductButton(100);
        System.out.println(product);
    }
}
// 가장 좋은 예가있다 할아버지를 떠올리자 할아버지는 걷기();라는 행동을 하기 위해서는 지팡이가 필요하다 -> 한마디로 지팡이에 의존한다.
// VendingMachineMain은 VendingMachine을 의존한다. 메소드에서 사용하는건 의존한다.