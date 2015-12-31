package com.burakiren.shareapp;

/**
 * Created by Burakiren on 14/12/2015.
 */
public class User {
    String name, username, password, email;
    int age;

    public User(String name, int age, String username, String password, String email) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.age = -1;
        this.name = "";
        this.email = "";
    }

}
