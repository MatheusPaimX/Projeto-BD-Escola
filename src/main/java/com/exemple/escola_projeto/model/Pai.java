package com.exemple.escola_projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pais")
public class Pai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPai;

    // @NotBlank(message = "O nome do Pai é obrigatório")
    private String nomePai;

    // @NotNull(message = "A data de nascimento do Pai é obrigatória")
    private String nascimentoPai;

    // @NotBlank(message = "O endereço do Pai é obrigatório")
    private String enderecoPai;

    // @NotBlank(message = "O CEP do Pai é obrigatório")
    // @Pattern(regexp = "^\\d{5}-\\d{3}$", message = "CEP deve estar no formato 00000-000")
    private String cepPai;

    // @NotBlank(message = "O CPF do Pai é obrigatório")
    // @Pattern(regexp = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$", message = "CPF deve estar no formato 000.000.000-00")
    private String cpfPai;

    // @NotBlank(message = "O RG do Pai é obrigatório")
    private String rgPai;

    // @NotBlank(message = "A profissão do Pai é obrigatória")
    private String profissaoPai;

    // @NotBlank(message = "O telefone do Pai é obrigatório")
    // @Pattern(regexp = "^\\(\\d{2}\\) \\d{4}-\\d{4}$", message = "Telefone deve estar no formato (00) 0000-0000")
    private String telefonePai;

    // @NotBlank(message = "O e-mail do Pai é obrigatório")
    // @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "E-mail inválido")
    private String emailPai;

    // @NotBlank(message = "O local de trabalho do Pai é obrigatório")
    private String TrabalhoPai;


    // @NotBlank(message = "O telefone de trabalho do Pai é obrigatório")
    // @Pattern(regexp = "^\\(\\d{2}\\) \\d{4}-\\d{4}$", message = "Telefone de trabalho do pai deve estar no formato (00) 0000-0000")
    private String telefoneTrabalhoPai;

    // Getters and Setters
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

    public String getNascimentoPai() {
        return nascimentoPai;
    }

    public void setNascimentoPai(String nascimentoPai) {
        this.nascimentoPai = nascimentoPai;
    }

    public String getEnderecoPai() {
        return enderecoPai;
    }

    public void setEnderecoPai(String enderecoPai) {
        this.enderecoPai = enderecoPai;
    }

    public String getCepPai() {
        return cepPai;
    }

    public void setCepPai(String cepPai) {
        this.cepPai = cepPai;
    }

    public String getCpfPai() {
        return cpfPai;
    }

    public void setCpfPai(String cpfPai) {
        this.cpfPai = cpfPai;
    }

    public String getRgPai() {
        return rgPai;
    }

    public void setRgPai(String rgPai) {
        this.rgPai = rgPai;
    }

    public String getProfissaoPai() {
        return profissaoPai;
    }

    public void setProfissaoPai(String profissaoPai) {
        this.profissaoPai = profissaoPai;
    }

    public String getTrabalhoPai() {
        return TrabalhoPai;
    }

    public void setTrabalhoPai(String trabalhoPai) {
        TrabalhoPai = trabalhoPai;
    }

    public String getTelefonePai() {
        return telefonePai;
    }

    public void setTelefonePai(String telefonePai) {
        this.telefonePai = telefonePai;
    }

    public String getEmailPai() {
        return emailPai;
    }

    public void setEmailPai(String emailPai) {
        this.emailPai = emailPai;
    }

    public String getTelefoneTrabalhoPai() {
        return telefoneTrabalhoPai;
    }

    public void setTelefoneTrabalhoPai(String telefoneTrabalhoPai) {
        this.telefoneTrabalhoPai = telefoneTrabalhoPai;
    }
}
