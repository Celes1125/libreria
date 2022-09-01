package com.example.demo.services;

import com.example.demo.models.Client;
import com.example.demo.models.Seller;
import com.example.demo.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    public ResponseEntity<?> getUserById(int id){
        ArrayList <User> people = getPeople();
       try{
           return new ResponseEntity<>(people.get(id), HttpStatus.OK);}
       catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);}
    }

    private ArrayList<User> getPeople() {
        ArrayList <User> people = new ArrayList<>();
        people.add(new Client("Celeste", "Colautti", "colauttiadad@gmail.com", "123456", "23-09-1984"));
        people.add(new Seller ("Sebastian", "Contreras", "sebas@gmail.com", "123456", "23-10-1984"));
        return people;


    }
}
