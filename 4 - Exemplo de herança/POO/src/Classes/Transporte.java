package Classes;

public class Transporte {
    
    protected int capacidade;
    
    public Transporte() {
    
    }
    
    public Transporte(int capacidade) {        
        super();
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    @Override
    public String toString() {
        return "CAPACIDADE : " + capacidade + "\n";
    }
    
}
