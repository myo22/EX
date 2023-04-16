package com.example.ex2;

// 버스는 자동차다. -> Car car = new Bus(); 의미는 인스턴스는 Bus이지만 실제 참조하는 것은 Car이라는 것이다. Bus는 자동차의 한 종류이기 때문에 가능하다.
// Car라는 클래스를 상속받는 Bus 클래스가 있다. Car{달리다()}, Bus{안내방송()} 이러면 부모의 Bus.달리다();를 이용할 수 있다.
// ex) 오픈카를 가지고있는데 고급 식당에가서 발레파킹을 맡겼는데 주차 요원이 지붕을 열었다 닫았다 하면서 주차하면 기분이 어떨까?
// 그래서 오픈카는 달리다();의 기능만 이용해서 주차해야 하는 것이다.

public class Parent {
    public void main(String[] args){
        Car car = new Bus();
        car.ride();
    }
}
