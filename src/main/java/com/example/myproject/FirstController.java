package com.example.myproject;

import com.example.fw.Controller;

public class FirstController extends Controller {
    @Override
    protected void run() {
        System.out.println("별도로 동작하는 코드 1111");
    }

//    @Override  이렇게 자식에서 오버라이딩 해버리면 초기화와 마무리 코드가 같아야하는데 달라진다. -> final을 붙여주면 된다.
//    protected void init() {
//    System.out.println("내마음대로 init");
//    }
}
