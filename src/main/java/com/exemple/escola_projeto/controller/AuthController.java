package com.exemple.escola_projeto.controller;

import com.exemple.escola_projeto.config.JwtUtil;
import com.exemple.escola_projeto.model.Usuario;
import com.exemple.escola_projeto.service.UsuarioService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UsuarioService usuarioService;
    private final JwtUtil jwtUtil;

    public AuthController(UsuarioService usuarioService, JwtUtil jwtUtil) {
        this.usuarioService = usuarioService;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest req) {
        Usuario user = usuarioService.validaCredenciais(req.getUsername(), req.getPassword());
        String token = jwtUtil.generateToken(user.getUsername());
        return ResponseEntity.ok(new AuthResponse(token));
    }

    @Data @AllArgsConstructor @NoArgsConstructor
    static class AuthRequest {
        private String username;
        private String password;

        public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

    @Data
    static class AuthResponse {
         
        private String token;

        public AuthResponse() {}

        public AuthResponse(String token) {
            this.token = token;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
    
