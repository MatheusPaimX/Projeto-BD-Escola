package com.exemple.escola_projeto.dto;

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

    public Long getIdPai() {
        return idPai;
    }

    public void setIdPai(Long idPai) {
        this.idPai = idPai;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getEnderecoPai() {
        return enderecoPai;
    }

    public void setEnderecoPai(String enderecoPai) {
        this.enderecoPai = enderecoPai;
    }

    public String getNumeroCasaPai() {
        return numeroCasaPai;
    }

    public void setNumeroCasaPai(String numeroCasaPai) {
        this.numeroCasaPai = numeroCasaPai;
    }

    public String getTelefonePai() {
        return telefonePai;
    }

    public void setTelefonePai(String telefonePai) {
        this.telefonePai = telefonePai;
    }

    public String getTrabalhoPai() {
        return trabalhoPai;
    }

    public void setTrabalhoPai(String trabalhoPai) {
        this.trabalhoPai = trabalhoPai;
    }

    public String getTelefoneTrabalhoPai() {
        return telefoneTrabalhoPai;
    }

    public void setTelefoneTrabalhoPai(String telefoneTrabalhoPai) {
        this.telefoneTrabalhoPai = telefoneTrabalhoPai;
    }
}
