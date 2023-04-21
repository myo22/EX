package com.example.ex;

public class User {
    private String email; // 외부에서 접근 불가능(은닉화)
    private String password;
    private String name;

    // 생성자를 하나라도 만들게 되면 기본생성자가 자동으로 안만들어진다.
    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    // 매개변수를 3개 받아들이는걸 만들었는데 이때 이름은 같고 매개변수가 다른것
    // -> 생성자 오버로딩
    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    //get, set으로 시작하는 메소드를 프로퍼티라고 말한다.
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
