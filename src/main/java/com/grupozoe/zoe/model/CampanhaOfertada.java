package com.grupozoe.zoe.model;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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

    private String examesPrevistos; // texto simples, ex: "185 – Avaliação Clínica"
    private String materiaisNecessarios; // texto, ou lista
    private String observacoes; // condições especiais

    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String horarioAtendimento;
    private String condicoesAdicionais;
    
    public CampanhaOfertada() {
    }

    public CampanhaOfertada(String id, String solicitanteNome, String solicitanteEmail, String empresa, String filial,
            String enderecoCompleto, String responsavelFilial, String horarioFilial, String mesProgramacao,
            String examesPrevistos, String materiaisNecessarios, String observacoes, LocalDate dataInicio,
            LocalDate dataFim, String horarioAtendimento, String condicoesAdicionais) {
        this.id = id;
        this.solicitanteNome = solicitanteNome;
        this.solicitanteEmail = solicitanteEmail;
        this.empresa = empresa;
        this.filial = filial;
        this.enderecoCompleto = enderecoCompleto;
        this.responsavelFilial = responsavelFilial;
        this.horarioFilial = horarioFilial;
        this.mesProgramacao = mesProgramacao;
        this.examesPrevistos = examesPrevistos;
        this.materiaisNecessarios = materiaisNecessarios;
        this.observacoes = observacoes;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horarioAtendimento = horarioAtendimento;
        this.condicoesAdicionais = condicoesAdicionais;
    }

    public String getId() {
        return id;
    }

    public String getSolicitanteNome() {
        return solicitanteNome;
    }

    public void setSolicitanteNome(String solicitanteNome) {
        this.solicitanteNome = solicitanteNome;
    }

    public String getSolicitanteEmail() {
        return solicitanteEmail;
    }

    public void setSolicitanteEmail(String solicitanteEmail) {
        this.solicitanteEmail = solicitanteEmail;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public String getResponsavelFilial() {
        return responsavelFilial;
    }

    public void setResponsavelFilial(String responsavelFilial) {
        this.responsavelFilial = responsavelFilial;
    }

    public String getHorarioFilial() {
        return horarioFilial;
    }

    public void setHorarioFilial(String horarioFilial) {
        this.horarioFilial = horarioFilial;
    }

    public String getMesProgramacao() {
        return mesProgramacao;
    }

    public void setMesProgramacao(String mesProgramacao) {
        this.mesProgramacao = mesProgramacao;
    }

    public String getExamesPrevistos() {
        return examesPrevistos;
    }

    public void setExamesPrevistos(String examesPrevistos) {
        this.examesPrevistos = examesPrevistos;
    }

    public String getMateriaisNecessarios() {
        return materiaisNecessarios;
    }

    public void setMateriaisNecessarios(String materiaisNecessarios) {
        this.materiaisNecessarios = materiaisNecessarios;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getHorarioAtendimento() {
        return horarioAtendimento;
    }

    public void setHorarioAtendimento(String horarioAtendimento) {
        this.horarioAtendimento = horarioAtendimento;
    }

    public String getCondicoesAdicionais() {
        return condicoesAdicionais;
    }

    public void setCondicoesAdicionais(String condicoesAdicionais) {
        this.condicoesAdicionais = condicoesAdicionais;
    }

    @Override
    public String toString() {
        return "CampanhaOfertada [id=" + id + ", solicitanteNome=" + solicitanteNome + ", solicitanteEmail="
                + solicitanteEmail + ", empresa=" + empresa + ", filial=" + filial + ", enderecoCompleto="
                + enderecoCompleto + ", responsavelFilial=" + responsavelFilial + ", horarioFilial=" + horarioFilial
                + ", mesProgramacao=" + mesProgramacao + ", examesPrevistos=" + examesPrevistos
                + ", materiaisNecessarios=" + materiaisNecessarios + ", observacoes=" + observacoes + ", dataInicio="
                + dataInicio + ", dataFim=" + dataFim + ", horarioAtendimento=" + horarioAtendimento
                + ", condicoesAdicionais=" + condicoesAdicionais + "]";
    }

    public Object getValorHora() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValorHora'");
    }

    
   
}
