package tiendaDeVideo;
public class Video {
    String lanzamiento;
    String nombre;
    String categoria;
    String formato;
    String duracion;
    String estado;
    public Video(String lanzamiento,String nombre,String categoria,String formato,String duracion,String estado){
        this.lanzamiento=lanzamiento;
        this.nombre=nombre;
        this.categoria=categoria;
        this.formato=formato;
        this.duracion=duracion;
        this.estado=estado;
    }
    public Video(){
        
    }
    public String getLanzamiento() {
        return lanzamiento;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getFormato() {
        return formato;
    }
    public String getDuracion() {
        return duracion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
