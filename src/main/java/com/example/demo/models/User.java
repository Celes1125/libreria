package com.example.demo.models;

import java.util.Date;

public class User {

    public String name;
    public String lastName;
    public String email;
    private String password;
    public String birthday;

    public User(String name, String lastName, String email, String password, String birthday) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.birthday = birthday;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday + '\'' +
                '}';
    }
}


