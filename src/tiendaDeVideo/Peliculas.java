package tiendaDeVideo;
public class Peliculas extends Video {
    String secuelas;
    String codigo;
    public Peliculas(String codigo,String lanzamiento,String nombre,String categoria,String formato,String duracion,String secuelas,String estado) {
        super(lanzamiento,nombre,categoria,formato,duracion,estado);
        this.codigo=codigo;
        this.secuelas=secuelas;
    }
    public Peliculas(){
        
    }
    public String getSecuelas() {
        return secuelas;
    }
    public void setSecuelas(String secuelas) {
        this.secuelas = secuelas;
    }
}