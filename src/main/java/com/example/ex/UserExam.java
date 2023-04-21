package com.example.ex;

public class UserExam {
    public static void main(String[] args){
        User user = new User("dlalsgud12@naver.com", "minhyung");
//      System.out.println(user.name); 다른 클래스에서 접근이 안되기 때문에 오류가 발생한다.
        System.out.println(user.getName());
        System.out.println(user.getEmail());

        // getter 메소드만 있기 때문에 setter 메소드가 없어서 바꿀순 없다
        // -> 생성자에서 넣어준 값을 리턴해주는 값만 가지고 있는 객체 == 불변객체
    }
}
