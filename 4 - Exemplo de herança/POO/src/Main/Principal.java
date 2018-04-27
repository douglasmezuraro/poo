package Main;

import Classes.Automovel;

public class Principal {

    public static void main(String[] args) {
        Automovel carro = new Automovel(5, 4, "ABC-1234", 4);
        Automovel moto = new Automovel(2, 0, "XYZ-0000", 2);
        
        System.out.println("DADOS DO CARRO:\n" + carro.toString());
        System.out.println("DADOS DA MOTO:\n" + moto.toString());
    }
    
}
