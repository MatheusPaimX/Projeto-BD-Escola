// package com.exemple.escola_projeto.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Column;
// import jakarta.persistence.Table;

// @Entity
// @Table(name = "usuarios")
// public class Usuario {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     // @Column(nullable = false)
//     private String nome;

//     // @Column(nullable = false, unique = true)
//     private String email;

//     // @Column(nullable = false, unique = true)
//     private String username;

//     // @Column(nullable = false)
//     private String senha;

//     public Usuario() {
//     }

//     public Usuario(String nome, String email, String username, String senha) {
//         this.nome = nome;
//         this.email = email;
//         this.username = username;
//         this.senha = senha;
//     }

//     // Getters e Setters
//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getNome() {
//         return nome;
//     }

//     public void setNome(String nome) {
//         this.nome = nome;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }

//     public String getUsername() {
//         return username;
//     }

//     public void setUsername(String username) {
//         this.username = username;
//     }

//     public String getSenha() {
//         return senha;
//     }

//     public void setSenha(String senha) {
//         this.senha = senha;
//     }
// }
