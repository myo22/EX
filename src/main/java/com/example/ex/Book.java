package com.example.ex;

public class Book {
    private String title;
    private int price; // field price

    // 필드의 값을 수정하고 얻기 위한 메소드를 만든다. setter, getter
    // setter, getter - 프로퍼티(property) - price 프로퍼티
    public int getPrice() {
        return this.price * 2; // this는 내 자신 인스턴스를 참조하는 예약어(스태틱 메소드에서는 사용할 수 없다.)
    }

    public void setPrice(int price){ // 지역변수 price
        this.price = price;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }
// price 필드와 price 프로퍼티의 차이점에 대해 말할 수 있어야 한다. 필드 price는 클래스가 가지는것 price 프로퍼티는 getter, setter 메소드를 말하는것.
// Book 클래스는 몇개의 프로퍼티를 가지고 있습니까? 답: title, price

}
