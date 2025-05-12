package com.exemple.escola_projeto.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.exemple.escola_projeto.dto.MaeDto;
import com.exemple.escola_projeto.model.Mae;
import com.exemple.escola_projeto.repository.MaeRepository;

@Service
public class MaeService {

    private final MaeRepository maeRepository;

    public MaeService(MaeRepository maeRepository) {
        this.maeRepository = maeRepository;
    }

    public List<Mae> listarTodas() {
        return maeRepository.findAll();
    }

    public List<MaeDto> listarTodosDto() {
        return maeRepository
                .findAll()
                .stream()
                .map(m -> new MaeDto(
                        m.getIdMae(),
                        m.getNomeMae(),
                        m.getEnderecoMae(),
                        m.getNumeroCasaMae(),
                        m.getTelefoneMae(),
                        m.getTrabalhoMae(),
                        m.getTelefoneTrabalhoMae()))
                .collect(Collectors.toList());
    }

    public List<MaeDto> buscarPorNomeMae(String nomeMae) {
        List<Mae> maes = maeRepository.findByNomeMaeContainingIgnoreCase(nomeMae);
        return maes.stream()
                .map(m -> new MaeDto(
                        m.getIdMae(),
                        m.getNomeMae(),
                        m.getEnderecoMae(),
                        m.getNumeroCasaMae(),
                        m.getTelefoneMae(),
                        m.getTrabalhoMae(),
                        m.getTelefoneTrabalhoMae()

                ))
                .collect(Collectors.toList());
    }

    public Mae buscarPorId(Long id) {
        return maeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Mãe não encontrada"));
    }

    public MaeDto buscarMaeDto(Long id) {
        Mae mae = maeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mãe não encontrada"));
        return maeDto(mae);
    }

    public Mae salvar(Mae mae) {

        Optional<Mae> cpfExistente = maeRepository.findByCpfMae(mae.getCpfMae());

        Optional<Mae> rgExistente = maeRepository.findByRgMae(mae.getRgMae());

        if (cpfExistente.isPresent()) {
            throw new RuntimeException("CPF já cadastrado!");
        }

        if (rgExistente.isPresent()) {
            throw new RuntimeException("RG já cadastrado!");
        }

        return maeRepository.save(mae);
    }

    public Mae atualizar(Long id, Mae novaMae) {
        return maeRepository.findById(id)
                .map(mae -> {
                    mae.setNomeMae(novaMae.getNomeMae());
                    mae.setNascimentoMae(novaMae.getNascimentoMae());
                    mae.setEnderecoMae(novaMae.getEnderecoMae());
                    mae.setNumeroCasaMae(novaMae.getNumeroCasaMae());
                    mae.setCepMae(novaMae.getCepMae());
                    mae.setCpfMae(novaMae.getCpfMae());
                    mae.setRgMae(novaMae.getRgMae());
                    mae.setProfissaoMae(novaMae.getProfissaoMae());
                    mae.setTelefoneMae(novaMae.getTelefoneMae());
                    mae.setEmailMae(novaMae.getEmailMae());
                    mae.setTrabalhoMae(novaMae.getTrabalhoMae());
                    mae.setTelefoneTrabalhoMae(novaMae.getTelefoneTrabalhoMae());
                    return maeRepository.save(mae);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Mãe não encontrada"));
    }

    public void deletar(Long id) {
        if (!maeRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Mãe não encontrada");
        }
        maeRepository.deleteById(id);
    }

    private MaeDto maeDto(Mae mae) {
        return new MaeDto(
                mae.getIdMae(),
                mae.getNomeMae(),
                mae.getEnderecoMae(),
                mae.getNumeroCasaMae(),
                mae.getTelefoneMae(),
                mae.getTrabalhoMae(),
                mae.getTelefoneTrabalhoMae());
    }
}
