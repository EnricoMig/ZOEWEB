package com.grupozoe.zoe.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CampanhaAceita")
public class CampanhaAceita {
    @Id
    private String id;
    
    private LocalDate dataAceita;

    private String ofertadaID;
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

    private String medicoID;
    private String nomeCompleto;
    private String crm;
    private String cpf;
    private String rg;
    private Endereco endereco;  // usa o modelo completo
    private String telefone;
    private LocalDate dataNascimento; // YYYY-MM-DD (ou outro formato textual)
    
    public CampanhaAceita() {
    }

    public String getId() {
        return id;
    }

    public LocalDate getDataAceita() {
        return dataAceita;
    }

    public String getOfertadaID() {
        return ofertadaID;
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

    public String getMedicoID() {
        return medicoID;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCrm() {
        return crm;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

     public String getRg() {
        return rg;
    }
    

    public void setDataAceita(LocalDate dataAceita) {
        this.dataAceita = dataAceita;
    }

    public void setOfertadaID(String ofertadaID) {
        this.ofertadaID = ofertadaID;
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

    public void setMedicoID(String medicoID) {
        this.medicoID = medicoID;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "CampanhaAceita [id=" + id + ", dataAceita=" + dataAceita + ", solicitanteNome=" + solicitanteNome
                + ", solicitanteEmail=" + solicitanteEmail + ", empresa=" + empresa + ", filial=" + filial
                + ", horarioFilial=" + horarioFilial + ", mesProgramacao=" + mesProgramacao + ", nomeCompleto="
                + nomeCompleto + ", crm=" + crm + "]";
    }
//3942-0148
//(12)32121298

   
    
    

    

}


