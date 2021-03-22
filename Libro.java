public class Libro extends Publicacion{
    private String ISBN;
    private String edicion;
    private String autor;
    public String getISBN() {
        return ISBN;
    }
    public String getEdition() {
        return edicion;
    }
    public String getAuthor() {
        return autor;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
