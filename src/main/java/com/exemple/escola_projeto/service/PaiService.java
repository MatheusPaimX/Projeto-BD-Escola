package com.exemple.escola_projeto.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.exemple.escola_projeto.dto.PaiDto;
import com.exemple.escola_projeto.model.Pai;
import com.exemple.escola_projeto.repository.PaiRepository;

@Service
public class PaiService {

    private final PaiRepository paiRepository;

    public PaiService(PaiRepository paiRepository) {
        this.paiRepository = paiRepository;
    }

    public List<Pai> listarTodos() {
        return paiRepository.findAll();
    }

    public List<PaiDto> listarTodosDto() {
        return paiRepository
                .findAll()
                .stream()
                .map(p -> new PaiDto(
                        p.getIdPai(),
                        p.getNomePai(),
                        p.getEnderecoPai(),
                        p.getNumeroCasaPai(),
                        p.getTelefonePai(),
                        p.getTrabalhoPai(),
                        p.getTelefoneTrabalhoPai()))
                .collect(Collectors.toList());
    }

    public List<PaiDto> buscarPorNomePai(String nomePai) {
        List<Pai> pais = paiRepository.findByNomePaiContainingIgnoreCase(nomePai);
        return pais.stream()
                .map(p -> new PaiDto(
                        p.getIdPai(),
                        p.getNomePai(),
                        p.getEnderecoPai(),
                        p.getNumeroCasaPai(),
                        p.getTelefonePai(),
                        p.getTrabalhoPai(),
                        p.getTelefoneTrabalhoPai()

                ))
                .collect(Collectors.toList());
    }

    public Pai buscarPorId(Long id) {
        return paiRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pai não encontrada"));
    }

    public PaiDto buscarPaiDto(Long id) {
        Pai pai = paiRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pai não encontrado"));
        return paiDto(pai);
    }

    public List<PaiDto> listarTodosPaisDto() {
        return paiRepository.findAll().stream()
                .map(this::paiDto)
                .collect(Collectors.toList());
    }

    public Pai salvar(Pai pai) {
        return paiRepository.save(pai);
    }

    public Pai atualizar(Long id, Pai novaPai) {
        return paiRepository.findById(id)
                .map(pai -> {

                    pai.setNomePai(novaPai.getNomePai());
                    pai.setNascimentoPai(novaPai.getNascimentoPai());
                    pai.setEnderecoPai(novaPai.getEnderecoPai());
                    pai.setNumeroCasaPai(novaPai.getNumeroCasaPai());
                    pai.setCepPai(novaPai.getCepPai());
                    pai.setCpfPai(novaPai.getCpfPai());
                    pai.setRgPai(novaPai.getRgPai());
                    pai.setProfissaoPai(novaPai.getProfissaoPai());
                    pai.setTelefonePai(novaPai.getTelefonePai());
                    pai.setEmailPai(novaPai.getEmailPai());
                    pai.setTrabalhoPai(novaPai.getTrabalhoPai());
                    pai.setTelefoneTrabalhoPai(novaPai.getTelefoneTrabalhoPai());
                    return paiRepository.save(pai);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Pai não encontrada"));
    }

    public void deletar(Long id) {
        if (!paiRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pai não encontrado");
        }
        paiRepository.deleteById(id);
    }

    private PaiDto paiDto(Pai pai) {
        return new PaiDto(
                pai.getIdPai(),
                pai.getNomePai(),
                pai.getEnderecoPai(),
                pai.getNumeroCasaPai(),
                pai.getTelefonePai(),
                pai.getTrabalhoPai(),
                pai.getTelefoneTrabalhoPai());
    }
}
