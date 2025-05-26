package com.exemple.escola_projeto.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.exemple.escola_projeto.dto.AlunoDto;
import com.exemple.escola_projeto.model.Aluno;
import com.exemple.escola_projeto.repository.AlunoRepository;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> buscarPorId(Long id) {
        return alunoRepository.findById(id);
    }

    public List<AlunoDto> listarTodosDto() {
        return alunoRepository
                .findAll()
                .stream()
                .map(a -> new AlunoDto(
                    a.getId(),
                    a.getNome(),
                    a.getSexo(),
                    a.getCpf(),
                    a.getRg(),
                    a.getAnoLetivo(),
                    a.getTurno(),
                    a.getTipoSanguineo()
                ))
                .collect(Collectors.toList());
    }

    public List<AlunoDto> buscarPorNome(String nome) {
        List<Aluno> alunos = alunoRepository.findByNomeContainingIgnoreCase(nome);
        return alunos.stream()
            .map(a -> new AlunoDto(
                a.getId(),
                a.getNome(),
                a.getSexo(),
                a.getCpf(),
                a.getRg(),
                a.getAnoLetivo(),
                a.getTurno(),
                a.getTipoSanguineo()
            ))
            .collect(Collectors.toList());
    }

    public AlunoDto buscarAlunoDto(Long id) {
        Aluno aluno = alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        return alunoDto(aluno);
    }

    public List<AlunoDto> buscarPorCpf(String cpf) {
        return alunoRepository
                .findByCpfContainingIgnoreCase(cpf)
                .stream()
                .map(a -> new AlunoDto(
                    a.getId(),
                    a.getNome(),
                    a.getSexo(),
                    a.getCpf(),
                    a.getRg(),
                    a.getAnoLetivo(),
                    a.getTurno(),
                    a.getTipoSanguineo()
                ))
                .collect(Collectors.toList());
    }

    public Aluno salvar(Aluno aluno) {
        
        Optional<Aluno> cpfExistente = alunoRepository.findByCpfContainingIgnoreCase(aluno.getCpf());

        Optional<Aluno> rgExistente = alunoRepository.findByRg(aluno.getRg());

        if (cpfExistente.isPresent()) {
            throw new RuntimeException("CPF já cadastrado!");
        }

        if (rgExistente.isPresent()) {
            throw new RuntimeException("RG já cadastrado!");
        }



        return alunoRepository.save(aluno);
    }

    public void deletar(Long id) {
        alunoRepository.deleteById(id);
    }
    

    public Aluno atualizar(Long id, Aluno novoAluno) {
        return alunoRepository.findById(id)
                .map(aluno -> {
                    aluno.setNome(novoAluno.getNome());
                    aluno.setDataNascimento(novoAluno.getDataNascimento());
                    aluno.setNaturalidade(novoAluno.getNaturalidade());
                    aluno.setNacionalidade(novoAluno.getNacionalidade());
                    aluno.setSexo(novoAluno.getSexo());
                    aluno.setCpf(novoAluno.getCpf());
                    aluno.setRg(novoAluno.getRg());
                    aluno.setAnoLetivo(novoAluno.getAnoLetivo());
                    aluno.setTermo(novoAluno.getTermo());
                    aluno.setFolha(novoAluno.getFolha());
                    aluno.setLivro(novoAluno.getLivro());
                    aluno.setMatricula(novoAluno.getMatricula());
                    aluno.setTurno(novoAluno.getTurno());
                    aluno.setTipoSanguineo(novoAluno.getTipoSanguineo());
                    aluno.setRaca(novoAluno.getRaca());
                    return alunoRepository.save(aluno);
                }).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    private AlunoDto alunoDto(Aluno aluno) {
        return new AlunoDto(
                aluno.getId(),
                aluno.getNome(),
                aluno.getSexo(),
                aluno.getCpf(),
                aluno.getRg(),
                aluno.getAnoLetivo(),
                aluno.getTurno(),
                aluno.getTipoSanguineo()
        );
    }
}
