package tiendaDeVideo;
public class Series extends Video {
    String temporadas;
    String codigo;
    int idx,n;
    public Series(String codigo,String lanzamiento,String nombre,String categoria,String formato,String duracion,String temporadas,String estado) {
        super(lanzamiento,nombre,categoria,formato,duracion,estado);
        this.codigo=codigo;
        this.temporadas=temporadas;
    }
    public Series(){
        
    }
    public String getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
    }
}
