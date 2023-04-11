package com.example.ex;

public class PersonTest2 {
    public static void main(String[] args){
        Person p1 = new Person(); // PersonTest2클래스를 실행하고 이 줄이 실행할려면 JVM이 CLASSPATH에서 Person 클래스를 찾아서 없음 에러나고 있으면 정보를 메모리에 올리는 것이다. = 클래스 정보 자체는 정적이다 정보 자체가 실행되는 것이 아니다.
        Person p2 = new Person(); // 여기서 정보를 읽어 들일 때 static한 필드는 정적 영역에 따로 저장된다. -> count변수는 인스턴스 별로 가지는 것이 아니라 정적 영역에 따로 보관

        p1.name = "사시미";
        p2.name = "김춘복";

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p1.count);
        System.out.println(p2.count);
        p1.count++;
        System.out.println(p1.count);
        System.out.println(p2.count); // p2는 증가시킨적 없는데 p2도 증가함?!
        p2.count++;
        System.out.println(p1.count);
        System.out.println(p2.count); // 같이 증가한다.

        System.out.println(Person.count); // 이렇게 사용하는 것이 가장 바람직하다. 클래스명.필드명
    }
}
