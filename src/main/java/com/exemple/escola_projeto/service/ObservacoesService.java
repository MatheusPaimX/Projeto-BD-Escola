package com.exemple.escola_projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.escola_projeto.dto.ObservacoesDto;
import com.exemple.escola_projeto.model.Observacoes;
import com.exemple.escola_projeto.repository.ObservacoesRepository;

@Service
public class ObservacoesService {

    @Autowired
    private ObservacoesRepository observacoesRepository;

    public List<Observacoes> listarTodos() {
        return observacoesRepository.findAll();
    }

    public Optional<Observacoes> buscarPorId(Long id) {
        return observacoesRepository.findById(id);
    }

    public ObservacoesDto buscarObservacoesDto(Long id) {
        Observacoes observacoes = observacoesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Observações não encontradas"));
        return observacoesDto(observacoes);
    }

    public Observacoes salvar(Observacoes observacoes) {
        return observacoesRepository.save(observacoes);
    }

    public Observacoes atualizar(Long id, Observacoes updatedObservacoes) {
        return observacoesRepository.findById(id).map(observacoes -> {
            observacoes.setMatriculaTipo(updatedObservacoes.getMatriculaTipo());
            observacoes.setEscola(updatedObservacoes.getEscola());
            observacoes.setTemIrmaos(updatedObservacoes.getTemIrmaos());
            observacoes.setIrmaosNome(updatedObservacoes.getIrmaosNome());
            observacoes.setTemEspecialista(updatedObservacoes.getTemEspecialista());
            observacoes.setEspecialista(updatedObservacoes.getEspecialista());
            observacoes.setTemAlergias(updatedObservacoes.getTemAlergias());
            observacoes.setAlergia(updatedObservacoes.getAlergia());
            observacoes.setTemMedicamento(updatedObservacoes.getTemMedicamento());
            observacoes.setMedicamento(updatedObservacoes.getMedicamento());
            observacoes.setReside(updatedObservacoes.getReside());
            observacoes.setRespNome(updatedObservacoes.getRespNome());
            observacoes.setRespTelefone(updatedObservacoes.getRespTelefone());
            observacoes.setPessoasAutorizadas(updatedObservacoes.getPessoasAutorizadas());
            
           
            observacoes.setTemEspecialista(updatedObservacoes.getTemEspecialista());
            return observacoesRepository.save(observacoes);
        }).orElseThrow(() -> new RuntimeException("Observações não encontradas com o id " + id));
    }

    public void deletar(Long id) {
        observacoesRepository.deleteById(id);
    }

    private ObservacoesDto observacoesDto(Observacoes observacoes) {
        return new ObservacoesDto(
                observacoes.getIdObservacoes(),
                observacoes.getTemEspecialista(),
                observacoes.getEspecialista(),
                observacoes.getTemAlergias(),
                observacoes.getAlergia(),
                observacoes.getTemMedicamento(),
                observacoes.getMedicamento(),   
                observacoes.getReside(),
                observacoes.getRespNome(),
                observacoes.getRespTelefone(),
                observacoes.getPessoasAutorizadas()
        );
    }

}

