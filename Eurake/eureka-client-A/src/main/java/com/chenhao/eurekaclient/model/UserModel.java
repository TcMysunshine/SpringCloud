package com.chenhao.eurekaclient.model;



import java.io.Serializable;

public class UserModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserModel() {
    }

    public UserModel(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
