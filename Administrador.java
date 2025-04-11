public class Administrador extends Usuario {

    public Administrador(int id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    public void registrarCliente(Cliente c) {

        System.out.println("Cliente registrado: " + c.nombre);
    }

    public void registrarLibro(Libro l) {

        System.out.println("Libro registrado: " + l.getTitulo());
    }

    public void realizarPrestamo(Usuario u, Libro l) {
        if (l.isDisponible()) {
            l.setDisponible(false);
            Prestamo p = new Prestamo(l, u);
            System.out.println("Préstamo realizado a " + u.nombre + " del libro " + l.getTitulo());
        } else {
            System.out.println("Libro no disponible.");
        }
    }
}
