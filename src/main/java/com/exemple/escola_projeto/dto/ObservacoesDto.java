package com.exemple.escola_projeto.dto;

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

    public Long getIdObservacoes() {
        return idObservacoes;
    }

    public void setIdObservacoes(Long idObservacoes) {
        this.idObservacoes = idObservacoes;
    }

    public String getTemEspecialista() {
        return temEspecialista;
    }

    public void setTemEspecialista(String temEspecialista) {
        this.temEspecialista = temEspecialista;
    }

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }

    public String getTemAlergias() {
        return temAlergias;
    }

    public void setTemAlergias(String temAlergias) {
        this.temAlergias = temAlergias;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getTemMedicamento() {
        return temMedicamento;
    }

    public void setTemMedicamento(String temMedicamento) {
        this.temMedicamento = temMedicamento;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getReside() {
        return reside;
    }

    public void setReside(String reside) {
        this.reside = reside;
    }

    public String getRespNome() {
        return respNome;
    }

    public void setRespNome(String respNome) {
        this.respNome = respNome;
    }

    public String getRespTelefone() {
        return respTelefone;
    }

    public void setRespTelefone(String respTelefone) {
        this.respTelefone = respTelefone;
    }

    public String getPessoasAutorizadas() {
        return pessoasAutorizadas;
    }

    public void setPessoasAutorizadas(String pessoasAutorizadas) {
        this.pessoasAutorizadas = pessoasAutorizadas;
    }

    
}
