package com.exemple.escola_projeto.dto;

import lombok.Data;

@Data
public class PaiDto {

    private Long idPai;

    private String nomePai;

    private String enderecoPai;

    private String numeroCasaPai;

    private String telefonePai;

    private String trabalhoPai;

    private String telefoneTrabalhoPai;

    public PaiDto(Long idPai, String nomePai, String enderecoPai, String numeroCasaPai, String telefonePai,
            String trabalhoPai,
            String telefoneTrabalhoPai) {
        this.idPai = idPai;
        this.nomePai = nomePai;
        this.enderecoPai = enderecoPai;
        this.numeroCasaPai = numeroCasaPai;
        this.telefonePai = telefonePai;
        this.trabalhoPai = trabalhoPai;
        this.telefoneTrabalhoPai = telefoneTrabalhoPai;
    }

   
}
