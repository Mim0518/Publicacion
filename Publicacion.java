
public abstract class Publicacion {
    private String titulo;
    private int numPag;
    private double precio;
    public  String getTitulo(){
        return titulo;
    }
    public int getNumPag() {
        return numPag;
    }
    public double getPrecio() {
        return precio;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
