package Classes;

public class Livro {
    
    private String titulo;
    private String autor;
    private String area;
    private String editora;
    private int ano;
    private int folhas;
    private boolean emprestimo;

    public Livro() {
        this.emprestimo = false;
    }
    
    public Livro(String titulo, String autor, String area, String editora, int ano, int folhas) {
        this.titulo = titulo;
        this.autor = autor;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
        this.folhas = folhas;
        this.emprestimo = false;
    }
    
    public void abrir() {
        System.out.println("Livro.abrir()");
    }
    
    public void fechar() {
        System.out.println("Livro.fechar()");
    }

    public int getFolhas() {
        return folhas;
    }

    public void setFolhas(int folhas) {
        this.folhas = folhas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }
    
}
