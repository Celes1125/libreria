package com.example.demo.services;
import com.example.demo.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class userService {

    private static final ArrayList<User> users = new ArrayList<>();
    public static void addDefaultUsers() {
        users.add(new User("Guillermo", "guille@gmail.com", 1234555));
        users.add(new User("Ana", "ana@gmail.com", 7755));
        users.add(new User("Cande", "cande@gmail.com", 77852));
        users.add(new User("Gastón", "gas@gmail.com", 1245555));
    }
    public ArrayList<User> createUsers(String name, String email, int password) {
        users.add(new User(name, email, password));
        return users;
    }
    public ArrayList<User> getAllUsers() {
        addDefaultUsers();
        return users;
    }
    public ResponseEntity<?> getUserById(int id) {
        try {
            return new ResponseEntity<>(users.get(id),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
