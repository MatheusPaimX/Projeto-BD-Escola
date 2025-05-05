package com.exemple.escola_projeto.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.escola_projeto.dto.MaeDto;
import com.exemple.escola_projeto.model.Mae;
import com.exemple.escola_projeto.service.MaeService;

@RestController
@RequestMapping("/maes")
public class MaeController {

    private final MaeService maeService;

    public MaeController(MaeService maeService) {
        this.maeService = maeService;
    }

    @GetMapping
    public List<Mae> listar() {
        return maeService.listarTodas();
    }

    @GetMapping("/{id}")
    public Mae buscar(@PathVariable Long id) {
        return maeService.buscarPorId(id);
    }

    @GetMapping("/buscarPorNome")
    public List<MaeDto> buscarMaesPorNome(
            @RequestParam(name = "nomeMae", required = false) String nomeMae) {
        if (nomeMae == null || nomeMae.isBlank()) {
            // retorna todos, ou retorna lista vazia, conforme sua regra de negócio
            return maeService.listarTodosDto();
        }
        return maeService.buscarPorNomeMae(nomeMae);
    }

    @GetMapping("dto/{id}")
    public ResponseEntity<MaeDto> buscarMaeResumo(@PathVariable Long id) {
        try {
            MaeDto dto = maeService.buscarMaeDto(id);
            return ResponseEntity.ok(dto);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<?> salvarMae(@RequestBody Mae mae) {
        try {
            Mae maeSalvo = maeService.salvar(mae);
            return new ResponseEntity<>(maeSalvo, HttpStatus.CREATED);
        } catch (RuntimeException e) {
            // Retorna erro se o CPF já estiver cadastrado
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public Mae atualizar(@PathVariable Long id, @RequestBody Mae mae) {
        return maeService.atualizar(id, mae);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        maeService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
