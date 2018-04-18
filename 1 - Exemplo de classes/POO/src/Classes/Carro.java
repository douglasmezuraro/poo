package Classes;

public class Carro {
    
    private String placa;
    private String cor;
    private String tipo;
    private int portas;
    private Pessoa dono;
    private int marcha;

    public Carro() {}

    public Carro(Pessoa dono, String placa, String cor, String tipo, int portas) {
        this.dono = dono;
        this.placa = placa;
        this.cor = cor;
        this.tipo = tipo;
        this.portas = portas;
    }
    
    public void ligar() {
        System.out.println("Carro.ligar()");
    }
    
    public void desligar() {
        System.out.println("Carro.desligar()");
    }
 
    public void acelerar() {
        System.out.println("Carro.acelerar()");
    }
    
    public void frear() {
        System.out.println("Carro.frear()");
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
    
    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }    

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        if((marcha >= 0) && (marcha <= 5))
            this.marcha = marcha;
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
        String result;
        
        result = "PLACA  : " + placa  + "\n" +
                 "COR    : " + cor    + "\n" +
                 "TIPO   : " + tipo   + "\n" +
                 "PORTAS : " + portas + "\n";
        
        if(dono != null)
            result += "DONO   : " + dono.getNome();
        
        return result;
    }
    
}
