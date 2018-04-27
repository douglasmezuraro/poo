package Classes;

public class Automovel extends Terrestre {
    
    private String placa;
    private int numeroPortas;
    
    public Automovel() {
    
    }
    
    public Automovel(int capacidade, int numeroRodas, String placa, int numeroPortas) {
        super(capacidade, numeroRodas);
        this.placa = placa;
        this.numeroPortas = numeroPortas;    
    } 

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }    
    
    @Override
    public String toString() {
        return super.toString() 
            + "PLACA : " + placa + "\n"
            + "NUMERO DE PORTAS : " + numeroPortas + "\n";
    }
    
}
