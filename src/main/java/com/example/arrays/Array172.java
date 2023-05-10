package com.example.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Array172 {
    public static void main(String[] args){
        Item[] items = new Item[5];
        items[0] = new Item("java", 5000);
        items[1] = new Item("파이썬", 4000);
        items[2] = new Item("C#", 4500);
        items[3] = new Item("자바스크팁트", 6000);
        items[4] = new Item("Dart", 2000);

        // sort(Object[]) - Object는 모든 객체의 조상이니깐. 어느 객체의 배열이든 올 수 있다.
//        Arrays.sort(items);
//         Arrays.sort(items, new ItemSorter()); items, 정렬방법정의

        // 이름없는 객체로 표현 ->람다식으로 표현한건데 유추가 가능하여 생략이 가능하다.
         Arrays.sort(items, (item1, item2) -> {
                 return item1.getName().compareTo(item2.getName());
         } );


        for (Item item : items){
            System.out.println(item);
        }
    }
}

class ItemSorter implements Comparator{ // 이때 메소드가 하나만 있는 인터페이스는 람다 인터페이스므로 더 줄일 수 있다.
    // o1 - o2
    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item)o1;
        Item item2 = (Item)o1;
        return item1.getName().compareTo(item2.getName());
    }
}

// Comparable는 어떤 Item이 큰지, 작은지 기준을 정하는 Interface이다.
class Item implements Comparable{
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 파라미터로 들어온 Object와 내 자신을 비교하는 메소드
    // compareTo에는 Object를 받아들이도록 했지만 실제로는 Item이 들어온다.
    // ex) 홍길동 vs 고길동 - 유니코드 순서대로 즉, 먼저나온게 작은값
//    @Override
//    public int compareTo(Object o) {
//        Item d = (Item)o;
//        return this.name.compareTo(d.name); // 양수, 0, 음수
//    }

    // 가격별로 정렬을 해달라한다
    @Override
    public int compareTo(Object o) {
        Item d = (Item)o;
        return this.price - d.price; // 양수, 0, 음수
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
