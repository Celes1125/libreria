package com.example.demo.services;
import com.example.demo.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class userService {

    private static final ArrayList<User> users = new ArrayList<>();

    public ArrayList <User> createUsers(String name, String email, int password) {
        users.add(new User (name, email, password));
        return users;

    }

}
