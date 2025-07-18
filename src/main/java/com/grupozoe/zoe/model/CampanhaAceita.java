package com.grupozoe.zoe.model;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CampanhasAceitas")
public class CampanhaAceita {

    @Id
    private String id;

    private String nomeCompleto;
    private String crm;
    private String cpf;
    private Endereco endereco;  // usa o modelo completo
    private String telefone;
    private LocalDate dataNascimento; // YYYY-MM-DD (ou outro formato textual)


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
    
    
    public CampanhaAceita() {
    }


    public String getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }


    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }


    public String getCrm() {
        return crm;
    }


    public void setCrm(String crm) {
        this.crm = crm;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public Endereco getEndereco() {
        return endereco;
    }


    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public LocalDate getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    
    
    
}


