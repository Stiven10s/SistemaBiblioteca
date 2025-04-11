import java.util.Date;

public class Prestamo {
    private Date fechaInicio;
    private Date fechaDevolucion;
    private String estado; // "activo" o "entregado"
    private Libro libro;
    private Usuario usuario;

    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = new Date();
        this.estado = "activo";
    }

    public void entregar() {
        this.fechaDevolucion = new Date();
        this.estado = "entregado";
        this.libro.setDisponible(true);
    }
}
