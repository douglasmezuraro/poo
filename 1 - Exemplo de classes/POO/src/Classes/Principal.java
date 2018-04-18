package Classes;

public class Principal {
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(
                "DOUGLAS MEZURARO", 
                21, 
                "BRANCO", 
                "CASTANHO");
        
        Carro carro = new Carro(
                pessoa, 
                "ABC-1234", 
                "PRETO", 
                "ESPORTIVO", 
                2);
                
        System.out.println(carro.toString());
        
        pessoa.setCarro(carro);
        
        pessoa.ligarCarro();
        pessoa.setMarcha(1);
        pessoa.acelerarCarro();
        
        pessoa.setMarcha(2);
        pessoa.acelerarCarro();
        
        pessoa.setMarcha(3);
        pessoa.acelerarCarro();
 
    }
    
}
