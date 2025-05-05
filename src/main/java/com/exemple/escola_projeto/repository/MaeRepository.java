package com.exemple.escola_projeto.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.escola_projeto.model.Mae;

public interface MaeRepository extends JpaRepository<Mae, Long> {
    Optional<Mae> findByCpfMae(String cpfMae);
    Optional<Mae> findByRgMae(String rgMae);
    List<Mae> findByNomeMaeContainingIgnoreCase(String nomeMae);

}
