package com.grupozoe.zoe.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "CampanhaOfertada")
public class CampanhaOfertada {

    @Id
    private String id;
    private String solicitanteNome;
    private String solicitanteEmail;
    private String empresa;
    private String filial;
    private String enderecoCompleto;
    private String responsavelFilial;
    private String horarioFilial;
    private String mesProgramacao;
    private String examesPrevistos;
    private String materiaisNecessarios;
    private String observacoes;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataInicio;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataFim;

    private String horarioAtendimento;
    private String condicoesAdicionais;

    
    public String getId() {
        return id;
    }


    public String getSolicitanteNome() {
        return solicitanteNome;
    }


    public String getSolicitanteEmail() {
        return solicitanteEmail;
    }


    public String getEmpresa() {
        return empresa;
    }


    public String getFilial() {
        return filial;
    }


    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }


    public String getResponsavelFilial() {
        return responsavelFilial;
    }


    public String getHorarioFilial() {
        return horarioFilial;
    }


    public String getMesProgramacao() {
        return mesProgramacao;
    }


    public String getExamesPrevistos() {
        return examesPrevistos;
    }


    public String getMateriaisNecessarios() {
        return materiaisNecessarios;
    }


    public String getObservacoes() {
        return observacoes;
    }


    public LocalDate getDataInicio() {
        return dataInicio;
    }


    public LocalDate getDataFim() {
        return dataFim;
    }


    public String getHorarioAtendimento() {
        return horarioAtendimento;
    }


    public String getCondicoesAdicionais() {
        return condicoesAdicionais;
    }

    public void setSolicitanteNome(String solicitanteNome) {
        this.solicitanteNome = solicitanteNome;
    }


    public void setSolicitanteEmail(String solicitanteEmail) {
        this.solicitanteEmail = solicitanteEmail;
    }


    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    public void setFilial(String filial) {
        this.filial = filial;
    }


    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }


    public void setResponsavelFilial(String responsavelFilial) {
        this.responsavelFilial = responsavelFilial;
    }


    public void setHorarioFilial(String horarioFilial) {
        this.horarioFilial = horarioFilial;
    }


    public void setMesProgramacao(String mesProgramacao) {
        this.mesProgramacao = mesProgramacao;
    }


    public void setExamesPrevistos(String examesPrevistos) {
        this.examesPrevistos = examesPrevistos;
    }


    public void setMateriaisNecessarios(String materiaisNecessarios) {
        this.materiaisNecessarios = materiaisNecessarios;
    }


    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }


    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }


    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }


    public void setHorarioAtendimento(String horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }


    public void setCondicoesAdicionais(String condicoesAdicionais) {
        this.condicoesAdicionais = condicoesAdicionais;
    }


    @Override
    public String toString() {
        return "CampanhaOfertada [id=" + id + ", empresa=" + empresa + "]";
    }
}
