// package com.exemple.escola_projeto.controller;

// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.exemple.escola_projeto.dto.UsuarioDto;
// import com.exemple.escola_projeto.model.Usuario;
// import com.exemple.escola_projeto.service.UsuarioService;

// @RestController
// @RequestMapping("/usuarios")
// public class UsuarioController {

//     private final UsuarioService usuarioService;
//     private final BCryptPasswordEncoder encoder;

//     @Autowired
//     public UsuarioController(UsuarioService usuarioService, BCryptPasswordEncoder encoder) {
//         this.usuarioService = usuarioService;
//         this.encoder = encoder;
//     }

//     @PostMapping("/cadastrar")
//     public ResponseEntity<?> cadastrar(@RequestBody Usuario usuario) {
//         if (usuarioService.buscarPorEmail(usuario.getEmail()).isPresent()) {
//             return ResponseEntity.badRequest().body("Email já cadastrado");
//         }

//         usuario.setSenha(encoder.encode(usuario.getSenha()));
//         Usuario novoUsuario = usuarioService.cadastrar(usuario);
//         return ResponseEntity.ok(new UsuarioDto(novoUsuario));
//     }

//     @PostMapping("/login")
//     public ResponseEntity<?> login(@RequestBody Usuario loginData) {
//         Optional<Usuario> usuarioOpt = usuarioService.buscarPorEmail(loginData.getEmail());

//         if (usuarioOpt.isEmpty()) {
//             return ResponseEntity.status(404).body("Usuário não encontrado");
//         }

//         Usuario usuario = usuarioOpt.get();
//         boolean senhaCorreta = encoder.matches(loginData.getSenha(), usuario.getSenha());

//         if (!senhaCorreta) {
//             return ResponseEntity.status(401).body("Senha incorreta");
//         }

//         return ResponseEntity.ok(new UsuarioDto(usuario));
//     }
// }
