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

import com.exemple.escola_projeto.dto.PaiDto;
import com.exemple.escola_projeto.model.Pai;
import com.exemple.escola_projeto.service.PaiService;

@RestController
@RequestMapping("/pais")
public class PaiController {

    private final PaiService paiService;

    public PaiController(PaiService paiService) {
        this.paiService = paiService;
    }

    @GetMapping
    public List<Pai> listar() {
        return paiService.listarTodos();
    }

    @GetMapping("/buscarPorNome")
    public List<PaiDto> buscarPaisPorNome(
            @RequestParam(name = "nomePai", required = false) String nomePai) {
        if (nomePai == null || nomePai.isBlank()) {
            return paiService.listarTodosDto();
        }
        return paiService.buscarPorNomePai(nomePai);
    }

    @GetMapping("/{id}")
    public Pai buscar(@PathVariable Long id) {
        return paiService.buscarPorId(id);
    }

    @GetMapping("dto/{id}")
    public ResponseEntity<PaiDto> buscarPaiResumo(@PathVariable Long id) {
        try {
            PaiDto dto = paiService.buscarPaiDto(id);
            return ResponseEntity.ok(dto);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("dto")
    public ResponseEntity<List<PaiDto>> listarTodosPaisDto() {
        List<PaiDto> listaDto = paiService.listarTodosPaisDto();
        return ResponseEntity.ok(listaDto);
    }

    
    @PostMapping
    public ResponseEntity<?> salvarPai(@RequestBody Pai pai) {
        try {
            Pai paiSalvo = paiService.salvar(pai);
            return new ResponseEntity<>(paiSalvo, HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public Pai atualizar(@PathVariable Long id, @RequestBody Pai pai) {
        return paiService.atualizar(id, pai);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        paiService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
