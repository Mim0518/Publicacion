public class Periodico extends Publicacion {
    private String Secciones;
    private String Editor;
    public String getEditor(){
        return Editor;
    }
    public String getSections(){
        return Secciones;
    }
    public void setEditor(String Editor){
        this.Editor = Editor;
    }
    public void setSections(String Secciones) {
        this.Secciones = Secciones;
    }
}
