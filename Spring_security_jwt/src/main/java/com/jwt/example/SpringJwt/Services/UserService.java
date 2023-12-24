package com.jwt.example.SpringJwt.Services;


import com.jwt.example.SpringJwt.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    public List<User> store=new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Asif","casif989@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Arshad","arshad989@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Kalam","kalam989@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Inul","inul989@gmail.com"));
    }

    public List<User> getUser(){
        return this.store;
    }

}
