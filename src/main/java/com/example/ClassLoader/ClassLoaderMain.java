package com.example.ClassLoader;

import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception{
        // a() 메소드를 가지고 있는 클래스가 있다.
        // 이 클래스이름이 아직 무엇인지 모르겠다.
        // 나중에 이 클래스 이름을 알려주겠다.
        // a() 메소드를 실행할 수 있도록 코드를 작성해라.

        // Bus3 b = new Bus3();
        // b.a();
        // 래퍼런스변수명.a();로 호출해야 하는데 Bus라는 이름을 모른다.

        // className에 해당하는 클래스 정보를 CLASSPATH에서 읽어들이고,
        // 그 정보를 clazz가 참조하도록 한다.
        // Object o = new Bus3();와 아래 세줄은 같다.
        // Car3 = new Bus3();
        String className= "com.example.ClassLoader.SuperCar2";
        Class clazz = Class.forName(className);
        Object o =clazz.newInstance();

        Method m =  clazz.getDeclaredMethod("a" , null); // a() 메소드 정보를 가지고 있는 Method를 반환해라
        m.invoke(o, null); // Object o가 참조하는 객체의 m 메소드를 실행해라.
    }
}

// 이것을 왜 설명했냐? 어려운데 -> 문자열로 된 클래스 이름과 문자열로 된 메소드 이름만 가지고도 표현할 수 있는 방법이 있구나.