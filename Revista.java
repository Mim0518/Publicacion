public class Revista extends Publicacion implements Periodicidad{
    private String ISSN;
    private  int numero;
    private int año;
    public String getISSN() {
        return ISSN;
    }
    public int getnumero() {
        return numero;
    }
    public int getYear() {
        return año;
    }
    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public String getPeriodicidad(){
        return periodicidad;
    }
}
