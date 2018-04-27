package Classes;

public class Terrestre extends Transporte {
   
    protected int numeroRodas;
    
    public Terrestre() {
    
    }
    
    public Terrestre(int capacidade, int numeroRodas) {
        super(capacidade);
        this.capacidade = capacidade;
        this.numeroRodas = numeroRodas;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }
    
    @Override
    public String toString() {
        return super.toString() 
            + "NUMERO DE RODAS : " + numeroRodas + "\n";
    }
    
}
