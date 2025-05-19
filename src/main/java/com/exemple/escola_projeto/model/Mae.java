package com.exemple.escola_projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "maes")
public class Mae {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMae;

    @NotNull(message = "O nome da mãe é obrigatório")
    private String nomeMae;

    @NotNull(message = "A data de nascimento da mãe é obrigatória")
    private String nascimentoMae;

    @NotNull(message = "O endereço da mãe é obrigatório")
    private String enderecoMae;

    @NotNull(message = "O número da casa da mãe é obrigatório")
    private String numeroCasaMae;

    @NotNull(message = "O CEP da mãe é obrigatório")
    @Pattern(regexp = "^\\d{5}-\\d{3}$", message = "CEP deve estar no formato 00000-000")
    private String cepMae;

    @NotNull(message = "O CPF da mãe é obrigatório")
    @Pattern(regexp = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$", message = "CPF deve estar no formato 000.000.000-00")
    private String cpfMae;

    @NotNull(message = "O RG da mãe é obrigatório")
    private String rgMae;

    @NotNull(message = "A profissão da mãe é obrigatória")
    private String profissaoMae;

    @NotNull(message = "O telefone da mãe é obrigatório")
    @Pattern(regexp = "^\\(\\d{2}\\) \\d{4}-\\d{4}$", message = "Telefone deveestar no formato (00) 0000-0000")
    private String telefoneMae;

    @NotNull(message = "O e-mail da mãe é obrigatório")
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "E-mail inválido")
    private String emailMae;

    @NotNull(message = "O local de trabalho da mãe é obrigatório")
    private String trabalhoMae;

    @NotNull(message = "O telefone de trabalho da mãe é obrigatório")
    @Pattern(regexp = "^\\(\\d{2}\\) \\d{4}-\\d{4}$", message = "Telefone de trabalho da mãe deve estar no formato (00) 0000-0000")
    private String telefoneTrabalhoMae;

    public Long getIdMae() {
        return idMae;
    }

    public void setIdMae(Long idMae) {
        this.idMae = idMae;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNascimentoMae() {
        return nascimentoMae;
    }

    public void setNascimentoMae(String nascimentoMae) {
        this.nascimentoMae = nascimentoMae;
    }

    public String getEnderecoMae() {
        return enderecoMae;
    }

    public void setEnderecoMae(String enderecoMae) {
        this.enderecoMae = enderecoMae;
    }

    public String getNumeroCasaMae() {
        return numeroCasaMae;
    }

    public void setNumeroCasaMae(String numeroCasaMae) {
        this.numeroCasaMae = numeroCasaMae;
    }

    public String getCepMae() {
        return cepMae;
    }

    public void setCepMae(String cepMae) {
        this.cepMae = cepMae;
    }

    public String getCpfMae() {
        return cpfMae;
    }

    public void setCpfMae(String cpfMae) {
        this.cpfMae = cpfMae;
    }

    public String getRgMae() {
        return rgMae;
    }

    public String getTrabalhoMae() {
        return trabalhoMae;
    }

    public void setTrabalhoMae(String trabalhoMae) {
        this.trabalhoMae = trabalhoMae;
    }

    public void setRgMae(String rgMae) {
        this.rgMae = rgMae;
    }

    public String getProfissaoMae() {
        return profissaoMae;
    }

    public void setProfissaoMae(String profissaoMae) {
        this.profissaoMae = profissaoMae;
    }

    public String getTelefoneMae() {
        return telefoneMae;
    }

    public void setTelefoneMae(String telefoneMae) {
        this.telefoneMae = telefoneMae;
    }

    public String getEmailMae() {
        return emailMae;
    }

    public void setEmailMae(String emailMae) {
        this.emailMae = emailMae;
    }

    public String getTelefoneTrabalhoMae() {
        return telefoneTrabalhoMae;
    }

    public void setTelefoneTrabalhoMae(String telefoneTrabalhoMae) {
        this.telefoneTrabalhoMae = telefoneTrabalhoMae;
    }

}
