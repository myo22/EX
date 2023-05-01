package com.example.ex;

public class BeanFactoryMain {
    public static void main(String[] args){
        BeanFactory bf1 = BeanFactory.getInstance();

        Bus b1 = bf1.getBus();
        Bus b2 = bf1.getBus();

        // Bus b3 = new Bus(); 이런식으로 직접 생성했는데 생성하는 과정을 BeanFactory에게 맡기는 것이다.
    }
}
