package com.exemple.escola_projeto.dto;

import lombok.Data;

@Data
public class AlunoDto {

    private Long id;
    private String nome;
    private String sexo;
    private String cpf;
    private String rg;
    private String anoLetivo;
    private String turno;
    private String tipoSanguineo;
    
    public AlunoDto(Long id, String nome, String sexo, String cpf, String rg, String anoLetivo, String turno,
            String tipoSanguineo) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.anoLetivo = anoLetivo;
        this.turno = turno;
        this.tipoSanguineo = tipoSanguineo;
    }
    
   

}
