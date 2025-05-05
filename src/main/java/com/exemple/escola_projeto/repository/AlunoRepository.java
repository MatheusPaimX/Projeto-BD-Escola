package com.exemple.escola_projeto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.escola_projeto.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    Optional<Aluno> findByCpfContainingIgnoreCase(String cpf);
    Optional<Aluno> findByRg(String rg);
    List<Aluno> findByNomeContainingIgnoreCase(String nome);

}
