package com.example;

// 인터페이스
// 무슨 기능을 만들어야 할까? vs 구현부터 하기
// 어떤 기능을 만들어야 할지부터 고민한다. 기능들끼리 묶은것.

// 인터페이스 Default 메소드 -> 오버라이딩도 물론 가능하다.
// 자바 8부터는 구현할 수 있다. 업데이트하여도 다른 사람들도 사용할 수 있도록 한것이다.
// static method도 추가되었다.

/*
1. 1~45까지 써있는 볼을 로또 기계에 넣는다.
2. 로또 기계에 있는 볼들을 섞는다.
3. 섞인 Ball중에서 6개를 꺼낸다.         즉 3가지 기능이 필요하다.
 */

// new로 객체를 만들 수 없음.
public interface LottoMachine {
    // 마찬가지로 public static을 다 생략해주는 것이다.
    int MAX_BALL_COUNT = 45; // 이러면 여기 숫자만 바꿔줘도 로또 개수를 조정할 수 있다.
    int RETURN_BALL_COUNT = 6;
    //인터페이스가 가지고 있는 메소드는 모두 추상메소드라 abstract를 생략가능한것이다.
    public void setBalls(Ball[] balls); // Ball[] Ball이 여러개를 받겠다. 45개를 받는다.
    public void mix(); // 자기가 가지고 있는 Ball들을 섞는다.
    public Ball[] getBalls(); // 6개의 Ball을 반환한다.
}