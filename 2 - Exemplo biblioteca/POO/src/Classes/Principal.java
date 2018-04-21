package Classes;

public class Principal {

    public static void main(String[] args) {
        Usuario usuario = new Usuario(
                "Douglas Mezuraro", 
                21, 
                'M', 
                "99947-7765");
        
        Livro livro = new Livro(
                "O Senhor os Anéis: A Sociedade do Anel",
                "Tolkien",
                "Aventura",
                "Allen & Unwin", 
                1954,
                1000);
        
        Emprestimo emprestimo = new Emprestimo(
                "17/04/2018", 
                "22:43", 
                livro, 
                usuario);
        
        emprestimo.getLivro().abrir();
        emprestimo.getUsuario().lerLivro();
        emprestimo.getLivro().fechar();
        emprestimo.devolverLivro();        
    }
    
}
