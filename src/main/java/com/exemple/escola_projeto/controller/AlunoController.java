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

import com.exemple.escola_projeto.dto.AlunoDto;
import com.exemple.escola_projeto.model.Aluno;
import com.exemple.escola_projeto.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> listar() {
        return alunoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Aluno buscar(@PathVariable Long id) {
        return alunoService.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    @GetMapping("/buscarPorNome")
    public List<AlunoDto> buscarAlunosPorNome(
            @RequestParam(name = "nome", required = false) String nome) {
        if (nome == null || nome.isBlank()) {
            return alunoService.listarTodosDto();
        }
        return alunoService.buscarPorNome(nome);
    }

    @GetMapping("/buscarPorCpf")
    public List<AlunoDto> buscarAlunosPorCpf(@RequestParam String cpf) {
    return alunoService.buscarPorCpf(cpf);
}
    @GetMapping("/{id}/resumo")
    public ResponseEntity<AlunoDto> buscarAlunoResumo(@PathVariable Long id) {
        AlunoDto alunoDto = alunoService.buscarAlunoDto(id);
        return ResponseEntity.ok(alunoDto);
    }

     @PostMapping
    public ResponseEntity<?> salvarAluno(@RequestBody Aluno aluno) {
        try {
            Aluno alunoSalvo = alunoService.salvar(aluno);
            return new ResponseEntity<>(alunoSalvo, HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public Aluno atualizar(@PathVariable Long id, @RequestBody Aluno aluno) {
        return alunoService.atualizar(id, aluno);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        alunoService.deletar(id);
    }
}
