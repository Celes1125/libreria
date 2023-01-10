package com.example.demo.models;

public class User {

    private String name;
    private String email;
    private long password;


    public User() {
    }

    public User(String name, String email, int password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                '}';
    }
}




