package com.exemple.escola_projeto.dto;

public class MaeDto {

    private Long idMae;

    private String nomeMae;

    private String enderecoMae;

    private String telefoneMae;

    private String trabalhoMae;

    private String telefoneTrabalhoMae;

    public MaeDto(Long idMae, String nomeMae, String enderecoMae, 
            String telefoneMae,  String trabalhoMae, String telefoneTrabalhoMae) {
        this.idMae = idMae;
        this.nomeMae = nomeMae;
        this.enderecoMae = enderecoMae;
        this.telefoneMae = telefoneMae;
        this.trabalhoMae = trabalhoMae;
        this.telefoneTrabalhoMae = telefoneTrabalhoMae;
    }

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

    public String getEnderecoMae() {
        return enderecoMae;
    }

    public void setEnderecoMae(String enderecoMae) {
        this.enderecoMae = enderecoMae;
    }

    public String getTelefoneMae() {
        return telefoneMae;
    }

    public void setTelefoneMae(String telefoneMae) {
        this.telefoneMae = telefoneMae;
    }

  
    public String getTrabalhoMae() {
        return trabalhoMae;
    }

    public void setTrabalhoMae(String trabalhoMae) {
        this.trabalhoMae = trabalhoMae;
    }

    public String getTelefoneTrabalhoMae() {
        return telefoneTrabalhoMae;
    }

    public void setTelefoneTrabalhoMae(String telefoneTrabalhoMae) {
        this.telefoneTrabalhoMae = telefoneTrabalhoMae;
    }
}
