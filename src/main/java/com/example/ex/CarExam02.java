package com.example.ex;

public class CarExam02 {
    public static void main(String[] args){
        Car c1 = new Car();
        System.out.println(c1); // System의 println의 오버로딩 중에서 Object를 받아들이는 println이 사용중이다.
                                // println(Object x) -> Object로 참조할 수 있는것은 무엇이든 받을 수 있다.
    }
}

// 부모타입의 변수로 자식인스턴스를 참조할 수 있다.
// 조상타입의 변수로 후손인스턴스를 참조할 수 있다.
// Car c1 = new Bus(); 오류가 안난다면 Bus는 Car의 자식이다.
// Car c2 = new 이층버스(); 이층버스는 Car의 자손이다.
// Object o1 = new Car();
// Object o2 = new Bus();
// Object o3 = new 이층버스();
// System.out.println(o1.toString()); == System.out.println(o1);
// equals는 같은 참조냐가 아니라 같은 값이냐?를 비교하는건데 기준을 정해주어야 한다. -> 오버라이딩해서 써야한다.
// (HashSet,HashMap) Hash알고리즘을 사용하기 위해서는 오버리이딩을 해야한다.