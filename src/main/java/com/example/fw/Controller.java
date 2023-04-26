package com.example.fw;

/*
Controller의 종류가 여러개더라. 종류가 여러개다? 상속이다
초기화 - 같은 코드
실행 - 다른 코드?
마무리 - 같은 코드
 */
public abstract class Controller {
    // protected는 같은 package거나 상속받았을 경우 접근 가능
    protected final void init(){ // 개별적으로 사용자가 실행못하도록 강제해주어야한다. -> 접근지정자 변경
        System.out.println("초기화 하는 코드");
    }
    protected final void close(){
        System.out.println("마무리 하는 코드");
    }
    protected abstract void  run(); // 매번 달라지는 코드

    // 내가 가지고 있는 메소드를 호출한다.
    // 어떤 순서를 가지고 있는데. 이런 메소드를 템플릿 메소드라고 한다.
    public void execute(){
        this.init(); // this. 생략가능
        this.run();
        this.close();
    }
}
