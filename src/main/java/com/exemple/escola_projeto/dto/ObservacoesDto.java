package com.exemple.escola_projeto.dto;

import lombok.Data;

@Data
public class ObservacoesDto {

    
    private Long idObservacoes;

    private String temEspecialista;

    private String especialista;

    private String temAlergias;

    private String alergia;

    private String temMedicamento;

    private String medicamento;

    private String reside;

    private String respNome;

    private String respTelefone;

    private String pessoasAutorizadas;
   
    public ObservacoesDto(Long idObservacoes, String temEspecialista, String especialista, String temAlergias,
            String alergia, String temMedicamento, String medicamento, String reside, String respNome,
            String respTelefone, String pessoasAutorizadas) {
        this.idObservacoes = idObservacoes;
        this.temEspecialista = temEspecialista;
        this.especialista = especialista;
        this.temAlergias = temAlergias;
        this.alergia = alergia;
        this.temMedicamento = temMedicamento;
        this.medicamento = medicamento;
        this.reside = reside;
        this.respNome = respNome;
        this.respTelefone = respTelefone;
        this.pessoasAutorizadas = pessoasAutorizadas;
    }

   

    
}
