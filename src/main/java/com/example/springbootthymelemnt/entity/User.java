package com.example.springbootthymelemnt.entity;

import lombok.Data;

@Data
public class User {
    private String name;
    private Integer age;
    private String pass;

    public User() {
    }

    public User(String name, Integer age, String pass) {
        this.name = name;
        this.age = age;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
