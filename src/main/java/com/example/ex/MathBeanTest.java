package com.example.ex;

public class MathBeanTest {
    public static void main(String[] args){ //static이 붙은 메소드는 해당 메소드를 가진 클래스가 인스턴스가 되지 않아도 사용할 수 있으므로 main 메소드가 실행가능한 것이다.
        MathBean math = new MathBean(); // MathBean 인스턴스는 heap 메모리에 올라간다. math가 리모콘과 비슷한 개념이라고 봐도 괜찮다 ex) TV 리모콘 = new TV() 리모콘을 누르면 TV전원이 켜지는 것처럼 math를 키면 MathBean이 켜지는 것이다.
        math.printClassName();
        math.printNumber(5000);
        int x = math.getOne(); //math가 참조하는 MathBean인스턴스의 메소드를 실행한다.
        System.out.println(x);
        int y = math.plus(200,300); //반환을 하니까 반환을 받아주는걸 적어줘야한다.
        System.out.println(y);
    }
}
