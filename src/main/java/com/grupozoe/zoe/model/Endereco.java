package com.grupozoe.zoe.model;

public class Endereco {

    private String logradouro;
    private int numero;
    private String cep;
    private String cidade;
    private String uf;
    private String bairro;
    private String complemento;

    // GETTERS e SETTERS
    public String getLogradouro() { return logradouro; }
    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getUf() { return uf; }
    public void setUf(String uf) { this.uf = uf; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }
    @Override
    public String toString() {
        return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", cep=" + cep + ", cidade=" + cidade
                + ", uf=" + uf + ", bairro=" + bairro + ", complemento=" + complemento + "]";
    }

    
}
