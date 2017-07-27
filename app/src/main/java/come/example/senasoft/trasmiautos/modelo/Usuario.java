package come.example.senasoft.trasmiautos.modelo;

/**
 * Created by Senasoft on 26/07/2017.
 */

public class Usuario {
    private String  nombre;
     private String  fechaNa;
    private String  correo;
    private String  fechaExpedicion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String nombre, String fechaNa, String correo, String fechaExpedicion) {
        this.nombre = nombre;
        this.fechaNa = fechaNa;
        this.correo = correo;
        this.fechaExpedicion = fechaExpedicion;
    }

    public String getFechaNa() {
        return fechaNa;
    }

    public void setFechaNa(String fechaNa) {
        this.fechaNa = fechaNa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(String fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }
}
