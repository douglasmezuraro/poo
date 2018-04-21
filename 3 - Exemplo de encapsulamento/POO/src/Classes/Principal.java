package Classes;

public class Principal {

    public static void main(String[] args) {
        Calendar a = new Calendar();
        Calendar b = new Calendar();
        
        a.anotate(02, 10, 2012, "Dia das crianças");
        b.anotate(07, 15, 2012, "Independência do Brasil");
        
        System.out.println(a.getFormatedDate());
        System.out.println(b.getFormatedDate());
    }
    
}
