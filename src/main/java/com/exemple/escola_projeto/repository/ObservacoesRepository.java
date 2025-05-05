package com.exemple.escola_projeto.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.escola_projeto.model.Observacoes;

public interface ObservacoesRepository extends JpaRepository<Observacoes, Long> {
}
