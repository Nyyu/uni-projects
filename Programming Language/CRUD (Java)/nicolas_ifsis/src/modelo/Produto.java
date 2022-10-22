package modelo;

import java.util.Date;


public class Produto {
    private int id;
    private String nome;
    private String unidadeDeMedida;
    private Date dataCadastro;
    
    public Produto() {
        
    }
    
    public Produto(int id) {
        this.id = id;
    }
    
    public Produto(int id, String nome, String unidadeDeMedida) {
        this.id = id;
        this.nome = nome;
        this.unidadeDeMedida = unidadeDeMedida;
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

    public String getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public void setUnidadeDeMedida(String unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
}
