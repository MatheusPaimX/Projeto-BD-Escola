package com.exemple.escola_projeto.controller;

import com.exemple.escola_projeto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password) {
        return userService.register(username, password);
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        boolean userenticated = userService.login(username, password);
        return userenticated ? "Login realizado com sucesso!" : "Usuário ou senha inválidos.";
    }
}
