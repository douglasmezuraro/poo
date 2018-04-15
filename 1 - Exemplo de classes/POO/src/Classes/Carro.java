package Classes;

public class Carro {
    
    private String placa;
    private String cor;
    private String tipo;
    private int portas;

    public Carro() {
    }

    public Carro(String placa, String cor, String tipo, int portas) {
        this.placa = placa;
        this.cor = cor;
        this.tipo = tipo;
        this.portas = portas;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
    
    @Override
    public String toString() {
        return "PLACA  : " + placa  + "\n" +
               "COR    : " + cor    + "\n" +
               "TIPO   : " + tipo   + "\n" +
               "PORTAS : " + portas + "\n";
    }
    
}
