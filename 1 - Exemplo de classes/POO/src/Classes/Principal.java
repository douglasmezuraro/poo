package Classes;

public class Principal {
    
    public static void main(String[] args) {
        Carro carro = new Carro("ABC-1234", "PRETO", "ESPORTIVO", 2);
        Pessoa pessoa = new Pessoa("DOUGLAS MEZURARO", 21, "BRANCO", "CASTANHO");
    
        System.out.println(carro.toString());
        System.out.println(pessoa.toString());
    }
    
}
