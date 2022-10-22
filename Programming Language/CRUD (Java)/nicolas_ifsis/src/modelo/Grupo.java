package modelo;


public class Grupo {
    private int id;
    private String nome;
    
    public Grupo() {
        
    }
    
     public Grupo(int id) {
        this.id = id;
    }
     
    public Grupo(int id, String nome) {
        this.id = id;
        this.nome = nome;
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
}
