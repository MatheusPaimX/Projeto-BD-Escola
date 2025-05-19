// src/main/java/com/exemple/escola_projeto/service/UsuarioService.java
package com.exemple.escola_projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.exemple.escola_projeto.model.Usuario;
import com.exemple.escola_projeto.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * Valida username e senha.
     * @throws RuntimeException se usuário não existir ou senha inválida
     */
    public Usuario validaCredenciais(String username, String rawPassword) {
        Usuario user = repo.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        if (!passwordEncoder.matches(rawPassword, user.getPassword())) {
            throw new RuntimeException("Senha inválida");
        }
        return user;
    }
}
