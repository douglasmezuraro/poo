package Classes;

public class Pessoa {
    
    private String nome;
    private int idade;
    private String biotipo;
    private String cabelo;

    public Pessoa() {
        
    }
    
    public Pessoa(String nome, int idade, String biotipo, String cabelo) {
        this.nome = nome;
        this.idade = idade;
        this.biotipo = biotipo;
        this.cabelo = cabelo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getBiotipo() {
        return biotipo;
    }

    public void setBiotipo(String biotipo) {
        this.biotipo = biotipo;
    }

    public String getCabelo() {
        return cabelo;
    }

    public void setCabelo(String cabelo) {
        this.cabelo = cabelo;
    }
    
    @Override
    public String toString() {
        return "NOME    : " + nome    + "\n" +
               "IDADE   : " + idade   + "\n" + 
               "BIOTIPO : " + biotipo + "\n" +
               "CABELO  : " + cabelo  + "\n";
    }
}
