package com.example.main;

import com.example.fw.Controller;
import com.example.myproject.FirstController;

public class ControllerMain {
    public static void main(String[] args){
        Controller c1 = new FirstController();
        c1.execute();
//      c1.init() 사용자가 실수로 초기화하는 코드만 실행한다면 초기화 하는 코드만 나오고 끝난다. -> init close 메소드는 사용자가 직접 호출하면 안된다.

    }
}
