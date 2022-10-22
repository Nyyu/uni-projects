package modelo;

import java.util.Date;



public class Usuario {
    
    private int id;
    private String nome;
    private String email;
    private String senha;
    private Date dataCriacao;

    public Usuario(int id, String nome, String email) {
        this.setId(id);
        this.setNome(nome);
        this.setEmail(email);
    }
    
    public Usuario() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    
}
