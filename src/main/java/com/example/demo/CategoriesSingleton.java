package com.example.demo;

import com.example.demo.models.User;

import java.util.ArrayList;

public final class CategoriesSingleton {
    //atributos
    private static CategoriesSingleton INSTANCE;
    private ArrayList<User> users;

    //constructor vacío pero con el atributo array users iniciado
    public CategoriesSingleton() {
        users = new ArrayList<>();
    }

    //método con el if...si no está esto no va a funcionar!!! este código instancia a INSTANCE si aún no ha sido instanciada, sino, llama a la que ya fue creada.

    public static  CategoriesSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new CategoriesSingleton();
        }
        return INSTANCE;
    }

    public ArrayList<User> getUsers(){
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }



}
