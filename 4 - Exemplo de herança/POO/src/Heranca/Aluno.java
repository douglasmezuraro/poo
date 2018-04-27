package Heranca;

public class Aluno extends Pessoa {
    
    protected String matricula;

    public Aluno() {
        super();
    }

    public Aluno(String matricula, String nome, String cpf, String dataNascimento) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }

    public Aluno(String matricula) {
        this.matricula = matricula;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
        
}
