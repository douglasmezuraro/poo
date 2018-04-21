package Classes;

public class Calendar {

    private int day;
    private int month;
    private int year;
    private String description;

    public void anotate(int day, int month, int year, String description) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.description = description;
        
        if(!validate()) 
            redefine();
    }

    private void redefine() {
        day = 0;
        month = 0;
        year = 0;
        description = "Data inválida";
    }

    private boolean validate() {
        return ((day >= 1) && (day <= 31) && (month >= 1) && (month <= 12));
    }

    public String getFormatedDate() {
        return day + "/" + month + "/" + year + ": " + description;
    }

}
