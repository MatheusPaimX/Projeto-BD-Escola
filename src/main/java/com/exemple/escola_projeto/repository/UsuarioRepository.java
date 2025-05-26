package com.exemple.escola_projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.exemple.escola_projeto.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
