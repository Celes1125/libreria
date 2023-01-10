package com.example.demo.services;
import com.example.demo.CategoriesSingleton;
import com.example.demo.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Objects;


@Service
public class UserService {
    public ResponseEntity<ArrayList<User>> createUsers(User newUser) {
        CategoriesSingleton cs = CategoriesSingleton.getInstance();
        ArrayList<User> users = cs.getUsers();
        users.add (newUser);
        cs.setUsers(users);
        return new ResponseEntity<>(users, HttpStatus.CREATED);
    }

    public ResponseEntity<ArrayList<User>> getAllUsers() {
        CategoriesSingleton cs = CategoriesSingleton.getInstance();
        ArrayList<User> users = cs.getUsers();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }

    public ResponseEntity<User> getUserById(String email) {
        CategoriesSingleton cs = CategoriesSingleton.getInstance();
        ArrayList<User> users = cs.getUsers();
        User user = users.stream()
                .filter(u -> Objects.equals(u.getEmail(), email) )
                .findFirst()
                .orElse(null);
        if(user != null){
            return new ResponseEntity<>(user, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public ArrayList<User> setUsers(User user) {
        CategoriesSingleton cs = CategoriesSingleton.getInstance();
        ArrayList<User> users = cs.getUsers();
        users.add (user);
        cs.setUsers(users);
        return users;

    }
}
