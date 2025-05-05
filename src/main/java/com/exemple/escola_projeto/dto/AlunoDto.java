package com.exemple.escola_projeto.dto;

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
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getAnoLetivo() {
        return anoLetivo;
    }
    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public String getTipoSanguineo() {
        return tipoSanguineo;
    }
    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

}
