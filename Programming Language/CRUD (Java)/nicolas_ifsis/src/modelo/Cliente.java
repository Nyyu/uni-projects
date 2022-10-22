package modelo;

import java.util.Date;

public class Cliente {
    private int id;
    private String nome;
    private String cpfcnpj;
    private String telefone;
    private String observacao;
    private Date datacriacao;

    public Cliente() {
        
    }
    
    public Cliente(int id) {
        this.id = id;
    }
    
    public Cliente(int id, String nome, String cpfcnpj, String telefone, String observacao) {
        this.id = id;
        this.nome = nome;
        this.cpfcnpj = cpfcnpj;
        this.telefone = telefone;
        this.observacao = observacao;
    }
    
    public Cliente(String nome, String cpfcnpj, String telefone, String observacao) {
        this.nome = nome;
        this.cpfcnpj = cpfcnpj;
        this.telefone = telefone;
        this.observacao = observacao;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDatacriacao() {
        return datacriacao;
    }

    public void setDatacriacao(Date datacriacao) {
        this.datacriacao = datacriacao;
    }
}
