package com.jwt.example.SpringJwt.Controller;

import com.jwt.example.SpringJwt.Model.User;
import com.jwt.example.SpringJwt.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUser() {
        return userService.getUser();

    }

    //To get current user name
        @GetMapping("/current-user")
    public String getLoggedinUser(Principal principal) {
        return principal.getName();
    }
}
