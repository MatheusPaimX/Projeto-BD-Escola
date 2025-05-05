package com.exemple.escola_projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "observacoes")
public class Observacoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idObservacoes;

    private String matriculaTipo;

    private String escola;

    private String temIrmaos;

    private String irmaosNome;

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
   
    public Long getIdObservacoes() {
        return idObservacoes;
    }

    public void setIdObservacoes(Long idObservacoes) {
        this.idObservacoes = idObservacoes;
    }

    public String getMatriculaTipo() {
        return matriculaTipo;
    }

    public void setMatriculaTipo(String matriculaTipo) {
        this.matriculaTipo = matriculaTipo;
    }

    public String getTemIrmaos() {
        return temIrmaos;
    }

    public void setTemIrmaos(String temIrmaos) {
        this.temIrmaos = temIrmaos;
    }

    public String getIrmaosNome() {
        return irmaosNome;
    }

    public void setIrmaosNome(String irmaosNome) {
        this.irmaosNome = irmaosNome;
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

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
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
