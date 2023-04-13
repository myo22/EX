package com.example.ex;

public class PersonTest {
    public static void main(String[] args){
       //  Person p1;  p1은 null이다.
        Person p1 = new Person();
        Person p2 = new Person(); // 이 줄을 실행할때는 이미 메모리에 올라가 있는 Person클래스 정보를 이용해 인스턴스를 생성한다는 것이다.


        p1.name = "사시미"; // 문자열은 new를 사용하지 않고 인스턴스를 사용할 수있다. 되도록 new를 사용하지 말자.
        p2.name = "김춘복";
        p1.isVip = true;



        System.out.println(p1.name); // 이제 값을 넣어줬으니 p1이 참조하는 인스턴스의 name이 참조하는 사시미가 출력
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        // System.out.println(p1.address.length()); // 아무것도 참조하지 않으므로 NullPointException 오류가 발생
        System.out.println(p1.isVip);
        System.out.println("-------------------------");
        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.isVip);
        // 전부 초기값을 설정 안하기 떄문에 아무것도 참조하지 못해서 null값과 false값을 가진다.
    }
}
