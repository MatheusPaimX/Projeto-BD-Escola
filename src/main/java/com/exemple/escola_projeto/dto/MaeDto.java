package com.exemple.escola_projeto.dto;

import lombok.Data;

@Data
public class MaeDto {

    private Long idMae;

    private String nomeMae;

    private String enderecoMae;

    private String numeroCasaMae;

    private String telefoneMae;

    private String trabalhoMae;

    private String telefoneTrabalhoMae;

    public MaeDto(Long idMae, String nomeMae, String enderecoMae, String numeroCasaMae,
            String telefoneMae, String trabalhoMae, String telefoneTrabalhoMae) {
        this.idMae = idMae;
        this.nomeMae = nomeMae;
        this.enderecoMae = enderecoMae;
        this.numeroCasaMae = numeroCasaMae;
        this.telefoneMae = telefoneMae;
        this.trabalhoMae = trabalhoMae;
        this.telefoneTrabalhoMae = telefoneTrabalhoMae;
    }

    
}
