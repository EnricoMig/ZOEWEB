package com.grupozoe.zoe.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "Medico")
public class Medico {

    @Id
    private String id;
    private String nomeCompleto;
    private String crm;
    private String cpf;
    private String rg;
    private Endereco endereco;  // usa o modelo completo
    private String telefone;
    private LocalDate dataNascimento; // YYYY-MM-DD (ou outro formato textual)

    
    public Medico() {
    }

    
    public Medico(String id, String nomeCompleto, String crm, String cpf, String rg, Endereco endereco, String telefone, LocalDate dataNascimento) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.crm = crm;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }


    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }

    public String getCrm() { return crm; }
    public void setCrm(String crm) { this.crm = crm; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }
    @Override
    public String toString() {
        return "Medico [id=" + id + ", nomeCompleto=" + nomeCompleto + ", crm=" + crm + ", cpf=" + cpf +", rg="+rg+ ", endereco="
                + endereco + ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + "]";
    }

    
}
